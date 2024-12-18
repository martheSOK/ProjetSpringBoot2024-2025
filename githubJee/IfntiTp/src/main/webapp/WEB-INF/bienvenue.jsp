

<%@ page import="com.IfntiTP.beans.BeanUtilisateur"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
</head>
<body> 
	 <% 
        BeanUtilisateur user = (BeanUtilisateur) session.getAttribute("utilisateur");   
    %>
    
     <h2>Bienvenue <%= user.getNom() %> </h2>
       <p>Votre mot de passe est : <%= user.getMotDePasse() %> </p>
	
	<form action="./Deconnexion" method="post">
        <button type="submit">Se déconnecter</button>
    </form>
</body>
</html>








