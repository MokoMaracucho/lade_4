<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ page isELIgnored="false"%>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>javaguides.net</title>
		<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/jquery-3.5.0.min.js" />"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	</head>

	<body>
 		<div class="container">
  			<div class="col-md-offset-2 col-md-7">
   				<h1>${message}</h1>
   				<hr />

   				<table class="table table-striped table-bordered">
    				<tr>
     					<td><b>Prénom :</b>${inscriptionForm.prenomNouvelUtilisateur}</td>
    				</tr>
    				<tr>
     					<td><b>Nom : </b>${inscriptionForm.nomNouvelUtilisateur}</td>
    				</tr>
    				<tr>
     					<td><b>Émail : </b>${inscriptionForm.emailNouvelUtilisateur}</td>
    				</tr>
    				<tr>
     					<td><b>Mot-de-passe : </b>${inscriptionForm.motDePasseNouvelUtilisateur}</td>
    				</tr>
   				</table>
  			</div>
 		</div>
	</body>
</html>