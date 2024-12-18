<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <%-- personnalisation <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %> --%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Connexion</title>
    <!-- Inclure votre fichier CSS -->
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>

	 <%-- <a:out value="${'Bienvenue sur ifnti.com444'}"/>  --%>
	 
	 <%-- <c:out value="${'Bienvenue sur ifnti.com'}"/>  --%>
	 
	 <%-- <c:import var="toto" url="https://ifnti.com/"></c:import> --%>
	 <%-- <c:import var="toto" url="https://img.freepik.com/photos-premium/image-photorealiste-hyper-realiste-fond-blanc-ai-generee-par-freepik_643360-543965.jpg?w=826"></c:import>
	 Bienvenue sur le site  <c:out value="${toto}"/>
	 --%>
	<%-- <c:set var="nom" scope="session" value="Marthe" /> --%>
	<%-- <p>Avant la supression</p>
	<c:out value="${nom}"/>
	<p>Après la supression</p>
	<c:remove var="nom"/>
	<c:out value="${nom}"/> --%>
	
	
	<%-- <c:if test="${ nom !='marthe' }">
		<p>Ton nom est différent de <c:out value="${nom}"></c:out></p>
	</c:if> --%>
	
	<%-- <c:catch var="exceptionCapture">
		<% int x = 2/0; %>
	</c:catch>
	<c:out value="${exceptionCapture}"/> --%>
	
	<%-- <p>Mon non est <c:out value="${nom}"/></p>
	<c:choose>
		<c:when test="${nom === 'marthe'}">
			C'est bien mon nom 
		</c:when>
		<c:when test="${nom !== 'marthe'}">
			C'est pas mon nom 
		</c:when>
	</c:choose> --%>
	
	<%-- <c:forEach var="i" begin="1" end="3">
		Élément <c:out value="${i}"/><br>
	</c:forEach> --%>
	
	<%-- <c:url value="/ifnti.jsp" var="urlComplete">
		<c:param name="trackingId" value="786"/>
		<c:param name="user" value="farida"/>
	</c:url>
	URL générée : ${urlComplete}
	 --%>
	<%--  
	 <c:set var="message" value="Hello, world!" />
	<c:if test="${fn:contains(message, 'world')}">
		<p>'world' est présent dans le message ${fn:contains(message, 'world')}</p>
		<p>'WORLD' est trouvé, sans tenir compte de la casse  ${fn:containsIgnoreCase(message, 'WORLD')}</p>
	</c:if>
	
	<c:set var="filename" value="document.pdf" />
	<c:if test="${fn:endsWith(filename, '.pdf')}">
		<p>Le fichier est un PDF ${fn:endsWith(filename, '.pdf')}</p>
	</c:if>
	
	
	<c:set var="message" value="Bonjour tout le monde" />
	<c:if test="${fn:startsWith(message, 'Bonjour')}">
	<p>Le message commence par 'Bonjour' ${fn:startsWith(message, 'Bonjour')}</p>
	</c:if>
	
	<c:set var="message" value="JavaServer Pages" />
	<p>Longueur du message : ${fn:length(message)}</p>
	
	<c:set var="message" value="Hello, world!" />
	<p>Sous-chaîne : ${fn:substring(message, 7, 12)}</p>
	
	<c:set var="email" value="user@example.com" />
	<p>Domaine : ${fn:substringAfter(email, '@')}</p>
	
	<c:set var="email" value="user@example.com" />
	<p>Nom d'utilisateur : ${fn:substringBefore(email, '@')}</p>
	
	<c:set var="message" value=" Bonjour " />
	<p>Message sans espaces : '${fn:trim(message)}'</p>
	
	
	<c:set var="message" value="HELLO" />
	<p>Minuscule : ${fn:toLowerCase(message)}</p>
	
	<c:set var="message" value="hello" />
	<p>Majuscule : ${fn:toUpperCase(message)}</p>
	
	<c:set var="message" value="Java is fun, Java is powerful" />
	<p>${fn:replace(message, 'Java', 'JSP')}</p>
	
	<c:set var="chaine" value="Java JSP Servlets" />
	<c:set var="list" value="${fn:split(chaine, ' ')}" />
	
	<p>${fn:join(list, ',')}</p>
	
	<c:set var="csv" value="apple,banana,cherry" />
	<c:forEach var="fruit" items="${fn:split(csv, ',')}">
		<p>Fruit : ${fruit}</p>
	</c:forEach>
	
	<c:set var="message" value="Hello, world!" />
	<p>Position de 'world' : ${fn:indexOf(message, 'world')}</p>
	 --%>
	 
	<%--  <c:set var="csv" value="apple,banana,cherry" />
	<c:forEach var="fruit" items="${fn:split(csv, ',')}">
		<p>Fruit : ${fruit}</p>
	</c:forEach>
	  --%>
	 
    <div class="login-container">
        <h2 class="form-title">Connexion</h2>
        <form action="./Connexion" method="post" class="login-form">
            <div class="form-group">
                <label for="nom">Nom d'utilisateur :</label>
                <input type="text" id="nom" name="nom" placeholder="Entrez votre nom" required>
            </div>
            <div class="form-group">
                <label for="password">Mot de passe :</label>
                <input type="password" id="password" name="password" placeholder="Entrez votre mot de passe" required>
            </div>
            <div class="form-group">
                <button type="submit" class="login-btn">Se connecter</button>
            </div>
            
            
            <div class="form-group">
                <button type="submit" class="login-btn">
                <a href="Inscription">S'inscrire</a>
                </button>
            </div>
        </form>
    </div>
</body>
</html>
