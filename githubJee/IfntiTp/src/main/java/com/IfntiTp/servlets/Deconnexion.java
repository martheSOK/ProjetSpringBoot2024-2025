package com.IfntiTp.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Deconnexion
 */
@WebServlet("/Deconnexion")
public class Deconnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session = request.getSession(false);
	        if(session != null) {
	        	 session.invalidate();
	        }
	       	response.sendRedirect("ifnti.jsp"); 
	        
	        
//			RequestDispatcher envoie = request.getRequestDispatcher("ifnti.jsp");		
//						envoie.forward(request , response);
	}

}



