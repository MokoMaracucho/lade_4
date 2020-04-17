<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<form:form action="succesInscription" cssClass="form form-expand-lg form-dark bg-dark form-margin-padding form-border" method="post" modelAttribute="inscriptionForm">
		<h1 class="font-weight-bold text-light">INSCRIPTION</h1>

            First name:
            <form:input path="prenomNUtilisateur" />

            <br><br> Nom
            <form:input path="nomUtilisateur" />
            <form:errors path="nomUtilisateur" cssClass="error" />

            <br><br> Free passes (*):
            <form:input path="emailUtilisateur" />
            <form:errors path="emailUtilisateur" cssClass="error" />

            <br><br> Email (*):
            <form:input path="email" />
            <form:errors path="email" cssClass="error" />

            <br><br> Postal Code:
            <form:input path="postalCode" />
            <form:errors path="postalCode" cssClass="error" />

            <br><br>

            <input type="submit" value="Submit" />

	</form:form>
</div>