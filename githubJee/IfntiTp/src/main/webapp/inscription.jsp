<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
 <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <div class="login-container">
    
        <h2 class="form-title">Inscription</h2>
        
        <form action="./Inscription" method="post" class="login-form">
            <div class="form-group">
                <label for="nom">Nom d'utilisateur :</label>
                <input type="text" id="nom" name="nom" placeholder="Entrez votre nom" required>
            </div>
            <div class="form-group">
                <label for="password">Mot de passe :</label>
                <input type="password" id="password" name="password" placeholder="Entrez votre mot de passe" required>
            </div>
            <div class="form-group">
                <button type="submit" class="login-btn">Enregistrer</button>
            </div>
        </form>
    </div>
</body>
</html>