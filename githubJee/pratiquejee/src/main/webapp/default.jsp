<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:out value="${'Bienvenue sur ifnti.com'}"/> --%>

<form action="./bienvenue" methode="get">
	<label>Nom</label>
	<input type="text" name="nom"/></br>
	
	<label>Age</label>
	<input type="number" name="age"/></br>
	
	
	<input type="submit" value="Envoyer" />
</form>

</body>
</html>