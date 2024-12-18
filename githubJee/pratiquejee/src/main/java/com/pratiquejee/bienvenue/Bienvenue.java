package com.projetEE.bienvenue;

import com.projetEE.beans.UserInfo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.projetEE.beans.UserInfo;



@WebServlet("/bienvenue") //permet de definir l'url qui fait appelle a cette servelet cette ligne replace tous le code contenu dans la balise servlet de webxml

public class Bienvenue  extends HttpServlet{
	 
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		//request.setAttribute("nom", 25);
		String nom= request.getParameter("nom");
		request.setAttribute("nom", nom);
		//String age= request.getParameter("age");
		
		
		
		UserInfo info= new UserInfo();
		//info.setAttribute("info", info);
		
		
		RequestDispatcher envoie = request.getRequestDispatcher("/WEB-INF/bienvenue.jsp");
		
		envoie.forward(request , response);
		
		
		
		
		
		
		
		
		
		
		//System.out.println("Hello world");
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();
		//out.append("Hello world");
		
		
//		out.print("<!DOCTYPE html>\n");
//		out.print("<html lang='fr'>\n");
//		out.print("<head>");
//		out.print("</head>");
//		out.print("<body>");
//		
//		out.print("<h1>");
//		
//		out.print("Bonjour à tous");
//		
//		out.print("</h1>");
//		
//		out.print("</body>");
//		out.print("</html>");
		
		
	 }

}
