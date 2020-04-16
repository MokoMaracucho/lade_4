<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		
		<title>Accueil | Les amis de l'escalade</title>
	</head>
	
	<body class="bg-grey">
		<header>
			<c:import url="include/navbar/navbar.jsp" ></c:import>
		</header>
		
<%-- 		<c:if test="${!empty requestScope.listeDemandesReservationTopo}"> --%>
<!-- 			<div class="div-container"> -->
<!-- 				<div class="container"> -->
<!-- 					<div class="row"> -->
<%-- 		        		<c:forEach var="demandeReservationTopo" items="${ sessionScope['listeDemandesReservationTopo'] }"> --%>
<!-- 	        				<div class="col-sm-3 form form-expand-lg form-dark bg-dark form-margin-padding form-border m-1 mt-3"> -->
<%-- 	        					<h5 class="font-weight-bold text-light">${ demandeReservationTopo.topoReservationTopo.nomTopo }</h5> --%>
		        				
<%-- 		        				<div class="small text-secondary"><strong>Demandeur : </strong>${ demandeReservationTopo.demandeurReservationTopo.prenomUtilisateur } ${ demandeReservationTopo.demandeurReservationTopo.nomUtilisateur }</div> --%>
		        				
<!-- 		        				<div> -->
<!-- 		        					<a type="button" href="/lade/" class="btn btn-success btn-sm text-dark mb-2">Accepter la demande</a> -->

<!-- 		        					<a type="button" href="/lade/" class="btn btn-danger btn-sm text-dark mb-2">Refuser la demande</a> -->
<!-- 	        					</div> -->
<!-- 	        				</div> -->
<%-- 		        		</c:forEach> --%>
<!-- 		  			</div> -->
<!-- 			    </div> -->
<!-- 			</div> -->
<%-- 	     </c:if> --%>
		
		<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>