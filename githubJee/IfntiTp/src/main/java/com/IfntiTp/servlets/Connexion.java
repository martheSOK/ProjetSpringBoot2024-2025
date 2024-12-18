package com.IfntiTp.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import com.IfntiTP.beans.BeanUtilisateur;

@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("user", request.getAttribute("user"));
		System.out.println(session);
		
		
		
		String nom = request.getParameter("nom");
        String password = request.getParameter("password");

        
       //BeanUtilisateur info_user = new  BeanUtilisateur();
        
       ArrayList <BeanUtilisateur> utilisateurs = BeanUtilisateur.getUserInscrit();
       
       System.out.println(" voici l'utilisateur inscrit " + utilisateurs);
       
       
       for (BeanUtilisateur user : utilisateurs) {
    	   if(user.getNom().equals(nom) && user.getMotDePasse().equals(password)){
    	          request.setAttribute("utilisateur", user);
          	 RequestDispatcher envoie = request.getRequestDispatcher("WEB-INF/bienvenue.jsp");
          	 envoie.forward(request, response);
    	   }
   	
       }
     response.getWriter().println("Nom ou mot de passe incorrect");
     this.getServletContext().getRequestDispatcher("/ifnti.jsp").forward(request, response);
        
	}
	
		

}
