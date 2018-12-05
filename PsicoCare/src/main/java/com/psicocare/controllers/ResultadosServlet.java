package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResultadosServlett
 */
public class ResultadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Capturar respuestas de la sesion//
		
		   HttpSession session = request.getSession();

		int R1=(Integer) session.getAttribute("answer1");
		int R2=(Integer) session.getAttribute("answer2");
		int R3=(Integer) session.getAttribute("answer3");
		int R4=4;
		int R5=(Integer) session.getAttribute("answer5");

		// Parseamos como double las respuestas de la sesion//
		Double R1b=(double) R1;
		Double R2b=(double) R2;
		Double R3b=(double) R3;
		Double R4b=(double) R4;
		Double R5b=(double) R5;

	// MEtodos que generan las 4 componentes, Quizas es mejor que sean metodos desde un modelo?//		
		Double Anxiety = R1b+R2b+R3b+R4b+R5b;
		Double Stress = R1b+R2b+R3b+R4b+R5b;
		Double Socialanxiety = R1b+R2b+R3b+R4b+R5b;
		Double Depression = R1b+R2b+R3b+R4b+R5b;;
		
		
		// Pasamos los datos (mochila) para que se muestre en las barras de resultados de JSP//
		request.setAttribute("anxiety",Anxiety);
		request.setAttribute("depression",Depression);
		request.setAttribute("socialanxiety",Socialanxiety);
		request.setAttribute("stress",Stress);

		//Los metemos en la sesion con los nombres indicados//
		
		    session.setAttribute("Anxiety", Anxiety);		
		    session.setAttribute("Depression", Anxiety);		
		    session.setAttribute("Stress", Stress);		
		    session.setAttribute("Socialanxiety", Socialanxiety);		


			  
		// Mostrar en resultados.jsp(ruta /Resultados)//
		request.getRequestDispatcher("./resultados.jsp").forward(request, response);

		

	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Redireccion al servlet de Registro al pulsar en el boton "Register/	
		response.sendRedirect("/Register");
		//(ruta /Register)//
	}

}
