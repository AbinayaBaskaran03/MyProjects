package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.ebrain.dao.CustomerOrder_dao;
import com.ebrain.dto.CustomerOrder_dto;

/**
 * Servlet implementation class Customer_Order
 */
public class Customer_Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Order() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 List<CustomerOrder_dto> orderObj = null;
			try {
				orderObj = CustomerOrder_dao.getOrder();
			}catch(Exception e) {
				e.printStackTrace();	
			}
			
			request.setAttribute("keylist",orderObj);
			
			request.getRequestDispatcher("OrderIndex.jsp").include(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String customer_id=request.getParameter("customer_id");
		String order_no=request.getParameter("order_no");
		String order_date=request.getParameter("order_date");
		String no_of_items=request.getParameter("no_of_items");
		String order_sub_total=request.getParameter("order_sub_total");
		String order_discount=request.getParameter("order_discount");
		String order_total_amount=request.getParameter("order_total_amount");
		String payment_type=request.getParameter("payment_type");
		String delivery_date=request.getParameter("delivery_date");
		String status=request.getParameter("status");
		String created_date=request.getParameter("created_date");
		String created_by=request.getParameter("created_by");
		String modified_date=request.getParameter("modified_date");
		String modified_by=request.getParameter("modified_by");

		System.out.println("Details Submitted......");
		
		CustomerOrder_dto orderObj = new CustomerOrder_dto(id,customer_id,order_no,order_date,no_of_items,order_sub_total,order_discount,order_total_amount,payment_type,delivery_date,status,created_date,created_by,modified_date,modified_by);
		
		try {
			CustomerOrder_dao.saveOrder(orderObj);
		}catch(Exception e) {
            System.out.println(e);				
			}
		
		doGet(request, response);
	}

}
