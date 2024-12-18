package com.IfntiTp.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import  com.IfntiTP.beans.BeanUtilisateur;






@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher envoie = request.getRequestDispatcher("inscription.jsp");
			
			envoie.forward(request , response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String password =request.getParameter("password");
		
		
		BeanUtilisateur user= new BeanUtilisateur();
		
		 user.setNom(nom);
		 user.setMotDePasse(password);
		 user.add_user(user);
		 
		 request.setAttribute("userInformation", user);
		 
		 System.out.println(nom);
		 System.out.println(password);
		 System.out.println(user.getNom());
		 System.out.println(user.getMotDePasse());
		 
		 HttpSession session = request.getSession();
	        session.setAttribute("utilisateur", user);
	        
		 
		 
		 
		 RequestDispatcher envoie = request.getRequestDispatcher("ifnti.jsp");
			
			envoie.forward(request , response);
	}

}
