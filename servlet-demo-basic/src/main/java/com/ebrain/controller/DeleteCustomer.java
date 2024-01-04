package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ebrain.dto.CustomerOrder_dto;
import com.ebrain.dto.Customer_dto;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;
import com.ebrain.dao.CustomerOrder_dao;
import com.ebrain.dao.Customer_dao;

import java.util.List;

/**
 * Servlet implementation class DeleteCustomer
 */
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 Connection connect = null;
	        PreparedStatement state = null;
		  int numRowsdeleted = 0;
		  
		try {
			connect = DatabaseConnectionUtil.getconnection();

      String deletequery = "DELETE FROM tb_customer_order_abi WHERE order_no = 101";
      state = connect.prepareStatement(deletequery);
      numRowsdeleted = state.executeUpdate();
  } catch (Exception e) {
      e.printStackTrace();
		}
		System.out.println("Deleted...");
		
		 List<CustomerOrder_dto> Obj = null;
			try {
				Obj = CustomerOrder_dao.getOrder();
			}catch(Exception e) {
				e.printStackTrace();	
			}
			
			request.setAttribute("keylist",Obj);
			
			request.getRequestDispatcher("OrderIndex.jsp").include(request,response);
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		doGet(request, response);
	}

}
