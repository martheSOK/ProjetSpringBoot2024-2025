<%-- <%@page import="com.projetee.beans.UserInfos"%> --%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		  <h1>
		  		welcome to our website!!			
		  </h1>
		  <%-- <%int num=2; %>
		  
		  <%! %> <!-- declaration -->
		  
		  
		  <h2>le num est <%= ++num %></h2> <!-- balise d'expression -->
		  <% out.println("coucou"); %> --%>
		  <p>Date d’aujourd’hui est : <%= (new java.util.Date()).toLocaleString() %></p>
		  
		  <%-- je suis un commentaire --%>
		  
		 <%--  <% out.println("objet implicite");%>
		  <%= request.getQueryString() %> --%>
		  <%-- <% int age = (int)request.getAttribute("nom"); //object nom=25
		  	out.println(age);
		  %> --%>
		  
		  <%-- <% String nom = request.getParameter("nom");
		  String age = request.getParameter("age");
		  int ageProchain = Integer.valueOf(age);
		  	out.println("bienvenue : " + nom);
		  	out.println("votre age : " + age);
		  %> --%>
		  <%-- <%
		  	UserInfos eleve = (UserInfos)request.getAttribute("eleve");
		  	out.println("votre nom : " + eleve.getNom());
		  	out.println("votre age : " + eleve.getAge());
		  	
		  	
		  %> --%>
		  
		  
		  <!-- expresion language -->
		  
		  ${ "Bonjour" }
</body>
</html>