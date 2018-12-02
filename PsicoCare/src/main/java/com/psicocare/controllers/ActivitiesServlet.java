package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.psicocare.DAO.ActivityDAO;
import com.psicocare.models.Activity;

/**
 * Servlet implementation class ActivityServlet
 */
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ActivitiesServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//verificar que estamos logueados	
		/*if (request.getSession().getAttribute("id") != null) {
		} else {
			response.sendRedirect("login");
		
		}*/
		String aidrec = request.getParameter("aid");
		Activity unContent = null;
		try {
			
			int aidint = Integer.parseInt(aidrec);
			
			unContent = ActivityDAO.getInstance().getActivityByAid(aidint);
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("unContent", unContent);
		request.getRequestDispatcher("/activityGeneral.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
