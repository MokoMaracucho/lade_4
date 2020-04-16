<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<form:form action="succesInscription" cssClass="form form-expand-lg form-dark bg-dark form-margin-padding form-border" method="post" modelAttribute="inscriptionForm">
		<h1 class="font-weight-bold text-light">INSCRIPTION</h1>

		<div class="form-group">
	    	<label for="prenomNouvelUtilisateur" class="form-label-color">Prénom</label>
<%-- 			<div class="small text-warning p-form-warning">${ traitementFormulaireInscription.erreursInscription['prenomUtilisateur'] }</div> --%>
			<form:input path="prenomNouvelUtilisateur" cssClass="form-control" />
		</div>

		<div class="form-group">
	    	<label for="nomNouvelUtilisateur" class="form-label-color">Nom</label>
			<form:input path="nomNouvelUtilisateur" cssClass="form-control" />
		</div>

		<div class="form-group">
			<label for="emailNouvelUtilisateur" class="text-light">Émail</label>
			<form:input path="emailNouvelUtilisateur" cssClass="form-control" />
		</div>

		<div class="form-group">
			<label for="motDePasseNouvelUtilisateur" class="text-light">Mot-de-passe</label>
			<form:password path="motDePasseNouvelUtilisateur" cssClass="form-control" />
		</div>

		<button type="submit" class="btn btn-success">S'inscrire</button>
	</form:form>
</div>