package com.psicocare.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.models.Test;

public class TakeTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String paso = request.getParameter("paso");

		System.out.println(paso);

		int pasoInt = paso == null ? 0 : Integer.parseInt(paso);

		request.setAttribute("paso", pasoInt);
		request.getRequestDispatcher("/test.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String respuestarec = request.getParameter("respuestainput");
		int respuestarecInt =respuestarec == null ? 0 : Integer.parseInt(respuestarec);

		String paso = request.getParameter("paso");
		int pasoInt = paso == null ? 0 : Integer.parseInt(paso);

		Test respuesta = request.getSession().getAttribute("respuesta") == null ? new Test()
				: (Test) request.getSession().getAttribute("respuesta");

		if (pasoInt == 1)
			respuesta.setRespuesta1(respuestarecInt);
		else if (pasoInt == 2)
			respuesta.setRespuesta2(respuestarecInt);
		else if (pasoInt == 3)
			respuesta.setRespuesta3(respuestarecInt);
		else if (pasoInt == 4)
			respuesta.setRespuesta4(respuestarecInt);
		else if (pasoInt == 5)
			respuesta.setRespuesta5(respuestarecInt);

		doGet(request, response);

	}

}
