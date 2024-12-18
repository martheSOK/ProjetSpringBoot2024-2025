<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
	<sql:query datasource="${db}" var="resultat">
        SELECT * FROM javaee.utilisateurs;
    </sql:query>

    <table border="1">
        <thead>
            <tr><th>Nom</th><th>Prenom</th><th>Age</th><th>Email</th></tr>
        </thead>
       <tbody>
            <c:forEach var="row" items="${resultat.rows}">
                <tr>
                <td>${row.nom}</td>
                <td>${row.prenom}</td>
                <td>${row.age}</td>
                <td>${row.email}</td>
                </tr>
            </c:forEach>
       </tbody>
        
    </table>

</body>
</html>


