<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource
        var="db"
        driver="org.postgresql.Driver"
        url="jdbc:postgresql://localhost:5432/gestion_utilisateurs"
        user="david"
        password="2004"/>
    
	<sql:update datasource="${db}" var="insertCount">
       INSERT INTO javaee.utilisateurs (nom, prenom, age, email) VALUES("DAO","jule",12,"jule@gmail.com");
    </sql:update>
    Nombre de lignes inserées: ${insertCount}
</body>
</html>