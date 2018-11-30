package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TakeTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String paso=request.getParameter("paso");
		
		String respuesta = request.getSession().getAttribute("respuesta")!=null?(String)request.getSession().getAttribute("respuesta"):null;
				
		
		String resppaso1=request.getParameter("resppaso1");
		String resppaso2=request.getParameter("resppaso2");
		String resppaso3=request.getParameter("resppaso3");
		String resppaso4=request.getParameter("resppaso4");
		
		respuesta=new String(resppaso1);
		
		request.getSession().setAttribute("respuesta",respuesta);*/
		
		request.getRequestDispatcher("/test.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
