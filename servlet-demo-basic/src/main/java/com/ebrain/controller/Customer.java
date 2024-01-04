package com.ebrain.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.ebrain.dto.Customer_dto;
import com.ebrain.dao.Customer_dao;

/**
 * Servlet implementation class Customer
 */
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 List<Customer_dto> cus = null;
		try {
			cus = Customer_dao.getAllDetails();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		request.setAttribute("keylist",cus);
		
		request.getRequestDispatcher("CusIndex.jsp").include(request,response);
		//response.sendRedirect("CustIndex.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String contact_person_name=request.getParameter("contact_person_name");
		String contact_person_phone=request.getParameter("contact_person_phone");
		String status=request.getParameter("status");
		String create_date=request.getParameter("create_date");
		String created_by=request.getParameter("created_by");
		String modified_date=request.getParameter("modified_date");
		String modified_by=request.getParameter("modified_by");
		
		System.out.println("Details Submitted......");
		
		Customer_dto MyObj = new Customer_dto(id,name,code,email,phone,contact_person_name,contact_person_phone,status,create_date,created_by,modified_date,modified_by);
		
		try {
			Customer_dao.saveCus(MyObj);
		}catch(Exception e) {
            System.out.println(e);				
			}
		
		doGet(request, response);
}

}
