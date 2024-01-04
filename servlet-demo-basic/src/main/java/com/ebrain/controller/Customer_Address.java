package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.ebrain.dao.CustomerAddress_dao;
import com.ebrain.dto.CustomerAddress_dto;



/**
 * Servlet implementation class Customer_Address
 */
public class Customer_Address extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Address() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 List<CustomerAddress_dto> addObj = null;
			try {
				addObj = CustomerAddress_dao.getAddress();
			}catch(Exception e) {
				e.printStackTrace();	
			}
			
			request.setAttribute("keylist",addObj);
			
			request.getRequestDispatcher("AddIndex.jsp").include(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String customer_id=request.getParameter("customer_id");
		String address_type=request.getParameter("address_type");
		String address_line1=request.getParameter("address_line1");
		String  address_line2=request.getParameter("address_line2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String postal_code=request.getParameter("postal_code");
CustomerAddress_dto addressObj=new CustomerAddress_dto(id,customer_id,address_type, address_line1, address_line2, city, state, country, postal_code);
		try {
			CustomerAddress_dao.saveAddress(addressObj);
		}catch(Exception e) {
			System.out.println(e);
		}
		doGet(request, response);
	}

}
