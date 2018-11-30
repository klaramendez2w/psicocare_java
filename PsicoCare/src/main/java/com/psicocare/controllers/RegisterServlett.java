package com.psicocare.controllers;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.psicocare.DAO.TestDAO;
import com.psicocare.DAO.UserDAO;

/**
 * Servlet implementation class RegisterServlett
 */
public class RegisterServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub



		request.getRequestDispatcher("./welcome2.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		//Capturamos las variables metidas en el formulario de registro*/
		String nombrerec= request.getParameter("name");
		String emailrec= request.getParameter("email");
		String userrec= request.getParameter("username");
		String password1rec= request.getParameter("password");
		String password2rec= request.getParameter("confirm");

		//Capturamos las variables metidas en la sesion tanto las respuestas como l//
		   	HttpSession session = request.getSession();
		  Double anxiedad=	(Double) session.getAttribute("Anxiety");		
		  Double depresion=	(Double)    session.getAttribute("Depression");		
		  Double estres=	(Double)   session.getAttribute("Stress");		
		  Double anxiedadsocial=	(Double)   session.getAttribute("Socialanxiety");	
			
	
		  //Obtener usuario de la sesion//
		  //Comprobar nombre en resultados//
		    
		//Llamar a las funciones de validacion de parametros y almacenarlas en la Base de Datos//
		    
		  try {
			  
			  
			int ok=TestDAO.getInstance().validateregisterform(nombrerec,emailrec,userrec,password1rec,password2rec);
			System.out.println(TestDAO.getInstance().validateregisterform(nombrerec,emailrec,userrec,password1rec,password2rec));
			
			System.out.println(TestDAO.getInstance().validatecomponentes(anxiedad,depresion,estres,anxiedadsocial));
			//Validar componentes almacenados en la sesion?
			if(ok==1) {
			
			//UserDAO.getInstance().subidausuario(nombrerec,emailrec,userrec,password1rec,anxiedad,depresion,estres,anxiedadsocial);	
			
			}
			else {
				
			
				request.setAttribute("errorsubida", "Los datos del formulario son incorrectos");

				
			}
		  }
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());		
				request.setAttribute("errorsubida", "Hubo un error durante la subida, por favor intentalo otra vez");
				
			}
			
			
	

			
			
		} 


		
	}


