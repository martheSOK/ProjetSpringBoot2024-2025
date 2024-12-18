<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div><h1>Liste des utilisateurs :</h1></div>
	
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Age</th>
						<th>Email</th>
					</tr>
				</thead>
				
				<tbody>
						 <!-- Boucle pour afficher les utilisateurs -->
			        <c:forEach var="user" items="${userListe}">
			            <tr>
			                <td>${user.id}</td>
			                <td>${user.nom}</td>
			                <td>${user.prenom}</td>
			                <td>${user.age}</td>
			                <td>${user.email}</td>
			            </tr>
			        </c:forEach>
				</tbody>
			
			</table>
		</div>
	</div>

</body>
</html>