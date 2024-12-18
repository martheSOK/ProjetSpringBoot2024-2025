<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./Suppression" method="post">
	
		<div class="form-group">
                <label for="id">ID :</label>
                <input type="number" id="id" name="id"  required>
           </div>
           
           <button type ="submit">Supprimer</button>
	
	</form>
</body>
</html>