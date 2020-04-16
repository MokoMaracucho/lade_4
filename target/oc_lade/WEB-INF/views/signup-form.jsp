<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Spring MVC 5 - form handling | Java Guides</title>
		<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/jquery-3.5.0.min.js" />"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	</head>

	<body>
 		<div class="container">
	  		<div class="col-md-offset-2 col-md-7">
   				<h2 class="text-center">Spring MVC 5 Form Handling Example - Sign up Form</h2>
   					<div class="panel panel-info">
    					<div class="panel-heading">
     						<div class="panel-title">INSCRIPTION</div>
    					</div>
    					<div class="panel-body">
     						<form:form action="saveSignUpForm" cssClass="form-horizontal" method="post" modelAttribute="signUpForm">

      						<div class="form-group">
       							<label for="prenomNouvelUtilisateur" class="col-md-3 control-label">Prénom : </label>
       							<div class="col-md-9">
        							<form:input path="prenomNouvelUtilisateur" cssClass="form-control" />
       							</div>
      						</div>		
      						
      						<div class="form-group">
       							<label for="nomNouvelUtilisateur" class="col-md-3 control-label">Nom : </label>
   								<div class="col-md-9">
							        <form:input path="nomNouvelUtilisateur" cssClass="form-control" />
       							</div>
      						</div>

      						<div class="form-group">
       							<label for="emailNouvelUtilisateur" class="col-md-3 control-label">Émail : </label>
       							<div class="col-md-9">
        							<form:input path="emailNouvelUtilisateur" cssClass="form-control" />
       							</div>
      						</div>

      						<div class="form-group">
       							<label for="motDePasseNouvelUtilisateur" class="col-md-3 control-label">Mot-de-passe : </label>
       							<div class="col-md-9">
        							<form:password path="motDePasseNouvelUtilisateur" cssClass="form-control" />
       							</div>
      						</div>

      						<div class="form-group">
       							<!-- Button -->
       							<div class="col-md-offset-3 col-md-9">
        							<form:button cssClass="btn btn-primary">S'inscrire</form:button>
       							</div>
      						</div>
					     </form:form>
    				</div>
   				</div>
  			</div>
 		</div>
	</body>
</html>