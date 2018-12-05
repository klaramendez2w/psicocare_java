package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.DAO.TestDAO;
import com.psicocare.models.Test;


public class ResultadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session.getAttribute("respuesta") != null) { // Aqui cogemos (get) el atributo usuario que establecimos en
															// el loginservlet

			// Capturar respuestas de la sesion//
			int R1 = ((Test) session).getRespuesta1();
			int R2 = ((Test) session).getRespuesta2();
			int R3 = ((Test) session).getResuesta3();
			int R4 = ((Test) session).getRespuesta4();
			int R5 = ((Test) session).getRespuesta5();
			
		
			

			System.out.println("Respuesta: " + R1 + R2 + R3 + R4 + R5);

			

		
			// MEtodos que generan las 4 componentes, Quizas es mejor que sean metodos desde
			// un modelo?//
			Double Anxiety = (double) (R1 + R2 + R3 + R4 + R5);
			Double Stress = (double) (R1 + R2 + R3 + R4 + R5);
			Double Socialanxiety = (double) (R1 + R2 + R3 + R4 + R5);
			Double Depression = (double) (R1 + R2 + R3 + R4 + R5);
			
			// Pasamos los datos (mochila) para que se muestre en las barras de resultados
			// de JSP//
			request.setAttribute("anxiety", Anxiety);
			request.setAttribute("depression", Depression);
			request.setAttribute("socialanxiety", Socialanxiety);
			request.setAttribute("stress", Stress);

			// Los metemos en la sesion con los nombres indicados//

			// HttpSession session = request.getSession();
			session.setAttribute("Anxiety", Anxiety);
			session.setAttribute("Depression", Anxiety);
			session.setAttribute("Stress", Stress);
			session.setAttribute("Socialanxiety", Socialanxiety);

			System.out.println("anxiety:" + Anxiety + "Stress:" + Stress + "Socialanxiety: " + Socialanxiety);

			// Mostrar en resultados.jsp(ruta /Resultados)//
			request.getRequestDispatcher("./resultados.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redireccion al servlet de Registro al pulsar en el boton "Register/
		response.sendRedirect("/Register");
		// (ruta /Register)//
	}

}
