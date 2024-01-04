package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.ebrain.dao.CustomerOrderItem_dao;
import com.ebrain.dto.CustomerOrderItem_dto;

/**
 * Servlet implementation class Customer_OrderItem
 */
public class Customer_OrderItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_OrderItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<CustomerOrderItem_dto> itemObj = null;
		try {
			itemObj = CustomerOrderItem_dao.getItemOrder();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		request.setAttribute("keylist",itemObj);
		
		request.getRequestDispatcher("OrderItemIndex.jsp").include(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String order_id=request.getParameter("order_id");
		String item_name=request.getParameter("item_name");
		String item_sku=request.getParameter("item_sku");
		String item_rate=request.getParameter("item_rate");
		String ordered_qty=request.getParameter("ordered_qty");
		String order_total=request.getParameter("order_total");
		
	System.out.println("Details Submitted......");
		
CustomerOrderItem_dto itemObj = new CustomerOrderItem_dto(id,order_id,item_name,item_sku,item_rate,ordered_qty,order_total);
		
		try {
			CustomerOrderItem_dao.saveItemOrder(itemObj);
		}catch(Exception e) {
            System.out.println(e);				
			}
		doGet(request, response);
	}

}
