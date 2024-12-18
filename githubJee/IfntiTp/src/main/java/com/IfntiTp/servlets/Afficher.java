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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.IfntiTp.Utils.Utils;

/**
 * Servlet implementation class Afficher
 */
@WebServlet("/Afficher")
public class Afficher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	// private static final String DB_URL = "jdbc:postgresql://localhost:5432/gestion_utilisateurs";
	// private static final String  DB_USER="david";
	// private static final String DB_PASSWORD="2004";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> userList = new ArrayList<>();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			//Connexion à la base de donnée et insertion des données
				Connection connection =Utils.gConnection();
			// Class.forName("org.postgresql.Driver");
			// Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			//Préparation de la reponse
			
			
			//Préparer la requete SQl d'insertion
			//String sql = "INSERT INTO javaee.utilisateurs(nom, prenom, age, email) VALUES(?,?,?,?)";
			//String sql = "UPDATE  javaee.utilisateurs SET nom = ?, prenom = ?, age = ? , email= ?  WHERE id = ?";
			String sql = "SELECT * from javaee.utilisateurs ";
			
			//Récupération des données
			Statement statement =connection.createStatement(); 
			ResultSet rersultSet = statement.executeQuery(sql);
			
			while(rersultSet.next()) {
				int id =rersultSet.getInt("id");
				String nom =rersultSet.getString("nom");
				String prenom =rersultSet.getString("prenom");
				int age =rersultSet.getInt("age");
				String email =rersultSet.getString("email");
				
				
				//Créer un objet utilisateur et l'ajouter à la liste
				userList.add(new User(id, nom , prenom, age ,email));
			}
			//Fermer la connexion
			rersultSet.close();
			statement.close();
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
		//stock la liste des utilisateur dans l'objet request
		request.setAttribute("userListe", userList);
		
		RequestDispatcher envoie = request.getRequestDispatcher("afficher.jsp");
		
		envoie.forward(request , response);
	}
	
	public class User{
		private int id;
		private String nom;
		private String prenom;
		private int age;
		private String email;
		
		public User(int id , String nom, String prenom, int age, String email) {
			this.id=id;
			this.nom=nom;
			this.prenom=prenom;
			this.age=age;
			this.email=email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
}












