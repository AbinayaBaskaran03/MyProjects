package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.ebrain.dao.AbidataDAO; 
import com.ebrain.entity.AbiData; 


/**
 * Servlet implementation class StudentdetailSubmission
 */
public class StudentdetailSubmission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentdetailSubmission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 List<AbiData> Data = null;
		try {
			 Data = AbidataDAO.getAllvalue();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		request.setAttribute("keylist",Data);
		
		request.getRequestDispatcher("index.jsp").include(request,response);
		
		//response.sendRedirect("index.jsp");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Studentid = request.getParameter("studentid");
		
		String Studentuser_name = request.getParameter("studentuser_name");
		
		String Studentfirst_name = request.getParameter("studentfirst_name");
		
		String Studentlast_name = request.getParameter("studentlast_name");
		
		String Studentmobile_no = request.getParameter("studentmobile_no");
		
		AbiData abidataObj = new AbiData(Integer.parseInt(Studentid),Studentuser_name,Studentfirst_name,Studentlast_name,Studentmobile_no);
		
		try {
			AbidataDAO.saveAbi(abidataObj);
		}
		catch(Exception e) {
			e.fillInStackTrace();
		}
		
		
		//System.out.println(Studentid+":"+Studentuser_name+":"+Studentfirst_name+":"+Studentlast_name+":"+Studentmobile_no);
		
		System.out.println("dopost executed.....");
		
		doGet(request, response);
	}

}
