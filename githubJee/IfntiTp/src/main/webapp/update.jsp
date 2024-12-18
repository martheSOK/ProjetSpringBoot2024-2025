<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <div class="login-container">
        <!-- <h2 class="form-title">Connexion</h2> -->
        <form action="./maj" method="post" class="login-form">
        	<div class="form-group">
                <label for="id">ID :</label>
                <input type="number" id="id" name="id"  required>
           </div>
        
            <div class="form-group">
                <label for="nom">Nom :</label>
                <input type="text" id="nom" name="nom" placeholder="Entrez votre nom" required>
            </div>
            <div class="form-group">
                <label for="prenom">Prenom :</label>
                <input type="text" id="prenom" name="prenom" placeholder="Entrez votre prenom" required>
            </div>
            <div class="form-group">
                <label for="age">Age :</label>
                <input type="number" id="age" name="age" placeholder="Entrez votre age" required>
            </div>
            <div class="form-group">
                <label for="email">Email :</label>
                <input type="email" id="email" name="email" placeholder="Entrez votre mail" required>
            </div>
        
            
            <div class="form-group">
                <button type="submit" class="login-btn">Update </button>
            </div>
        </form>
    </div>
</body>
</html>