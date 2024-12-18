package com.IfntiTp.Utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    private static final long serialVersionUID = 1L;
	

	private static final String DB_URL = "jdbc:postgresql://localhost:5432/gestion_utilisateurs";
	private static final String  DB_USER="david";
	private static final String DB_PASSWORD="2004";
               



    public static Connection gConnection()throws SQLException, ClassNotFoundException{
    //Connexion à la base de donnée et insertion des données
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return connection;
    } 
}
