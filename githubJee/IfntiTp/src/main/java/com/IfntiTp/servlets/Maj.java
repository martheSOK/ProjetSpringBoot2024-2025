package com.IfntiTp.servlets;
import com.IfntiTp.Utils.Utils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.IfntiTp.Utils.Utils;

/**
 * Servlet implementation class maj
 */
@WebServlet("/maj")
public class Maj extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// private static final String DB_URL = "jdbc:postgresql://localhost:5432/gestion_utilisateurs";
	// private static final String  DB_USER="david";
	// private static final String DB_PASSWORD="2004";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher envoie = request.getRequestDispatcher("update.jsp");
			
			envoie.forward(request , response);
		
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		
		//Préparation de la reponse
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			
			//Connexion à la base de donnée et insertion des données
			// Class.forName("org.postgresql.Driver");
			// Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Connection connection =Utils.gConnection();
			
			//Préparer la requete SQl d'insertion
			//String sql = "INSERT INTO javaee.utilisateurs(nom, prenom, age, email) VALUES(?,?,?,?)";
			String sql = "UPDATE  javaee.utilisateurs SET nom = ?, prenom = ?, age = ? , email= ?  WHERE id = ?";
			
			//Remplissage des données
			
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1,nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setInt(3, Integer.parseInt(age));
			preparedStatement.setString(4, email);
			preparedStatement.setInt(5, id);
			
			//Excution de la requete
			int rows = preparedStatement.executeUpdate();
			if (rows>0) {
				out.println("<h1>Les données ont étés mise à jours avec succè</h1>");
			}else {
				out.println("<h1>Échec de update des données</h1>");
			}
			
			//Fermer la connexion
			preparedStatement.close();
			connection.close();
		
		}
		catch(ClassNotFoundException e) {
			out.println("<h1>Erreur: Driver JDBC non trouvé.</h1>");
			e.printStackTrace(out);
		}
		catch(SQLException e) {
			out.println("<h1>Erreur lors de la connexion à la base de donnée.</h1>");
			e.printStackTrace(out);
		}
	}

}
