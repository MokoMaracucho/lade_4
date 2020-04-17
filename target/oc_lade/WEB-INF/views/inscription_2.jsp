<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <html>

    <head>
        <title>Inscription_2 | Les amis de l'escalade</title>

        <style>
            .error {
                color: red
            }
        </style>
    </head>

    <body>

        <form:form action="processForm" modelAttribute="customer">

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

    </body>

    </html>