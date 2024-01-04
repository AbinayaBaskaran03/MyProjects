package com.ebrain.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ebrain.jdbc.connection.DatabaseConnectionUtil;
import com.ebrain.dto.Customer_dto;
import com.ebrain.dao.Customer_dao;
import java.util.List;

/**
 * Servlet implementation class UpdateCustomer
 */
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Connection connect = null;
	        PreparedStatement state = null;
		  int numRowsUpdated = 0;
		  
		try {
			connect = DatabaseConnectionUtil.getconnection();
   
         String updatequery = "UPDATE tb_customer_abi SET status = 'Deleted'"
                    + " WHERE status = 'Active' LIMIT 5";
         state = connect.prepareStatement(updatequery);
         numRowsUpdated = state.executeUpdate();
     } catch (Exception e) {
         e.printStackTrace();
		}
		System.out.println("Updated");
		 List<Customer_dto> cus = null;
			try {
				cus = Customer_dao.getAllDetails();
			}catch(Exception e) {
				e.printStackTrace();	
			}
			
			request.setAttribute("keylist",cus);
			
			request.getRequestDispatcher("CusIndex.jsp").include(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
