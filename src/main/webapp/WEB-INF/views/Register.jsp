<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<%@ include file="bootstrap.html"%>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form method="POST" action="/register" modelAttribute="user">
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		
		<form:label path="email">Email</form:label>
		<form:input path="email" />

		<form:label path="password">Password</form:label>
		<form:input path="password" />

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>