<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Please login</title>
<link
	href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/dist/css/sb-admin-2.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">HISTORIQUE DES NAVIGUATIONS</h3>
					</div>
					<div class="panel-body">
						<f:form modelAttribute="student" method="GET"
							action="home" >
							<fieldset>
								<input type="hidden" name="list" value="1"/>
								<input type="submit" value="Historique naviguation"
									class="btn btn-lg btn-success btn-block" />
									
							</fieldset>
						</f:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/jquery/dist/jquery.min.js" />
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" />
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.js" />
	<script
		src="${pageContext.request.contextPath}/resources/dist/js/sb-admin-2.js" />
</body>

</html>
