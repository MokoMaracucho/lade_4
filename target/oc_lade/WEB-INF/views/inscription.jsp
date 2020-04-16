<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<!-- CDN : Bootstrap CSS -->
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
	<title>Inscription | Les amis de l'escalade</title>
</head>

<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<form:form action="succesInscription" cssClass="form form-expand-lg form-dark bg-dark form-margin-padding form-border" method="post" modelAttribute="inscriptionForm">
				<h1 class="font-weight-bold text-light">INSCRIPTION</h1>

				<div class="form-group">
					<label for="prenomNouvelUtilisateur" class="text-light">Prénom : </label>
<%-- 					<div class="small text-warning p-form-warning">${ traitementFormulaireInscription.erreursInscription['prenomUtilisateur'] }</div> --%>
					<div class="col-md-9">
						<form:input path="prenomNouvelUtilisateur" cssClass="form-control" />
					</div>
				</div>

				<div class="form-group">
					<label for="nomNouvelUtilisateur" class="text-light">Nom : </label>
					<div class="col-md-9">
						<form:input path="nomNouvelUtilisateur" cssClass="form-control" />
					</div>
				</div>

				<div class="form-group">
					<label for="emailNouvelUtilisateur" class="text-light">Émail : </label>
					<div class="col-md-9">
						<form:input path="emailNouvelUtilisateur" cssClass="form-control" />
					</div>
				</div>

				<div class="form-group">
					<label for="motDePasseNouvelUtilisateur" class="text-light">Mot-de-passe : </label>
					<div class="col-md-9">
						<form:password path="motDePasseNouvelUtilisateur" cssClass="form-control" />
					</div>
				</div>

				<button type="submit" class="btn btn-success">S'inscrire</button>
			</form:form>
		</div>
	</div>

	<!-- CDN : JQuery / Popper.js / Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script> -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>