<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="com.hcl.model.User"%>
    <%@ page session="true" %>
    <% String name = (String)session.getAttribute("currentsess"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="bootstrap.html"%>
<title>Dashboard</title>
</head>
<body>
 <jsp:include page="HelloUser.jsp" />
<br/><br/>
<div class="container d-flex justify-content-center align-items-center">

<div class="btn"><a href="task/display"><button type="button" class="btn btn-primary">Display Task</button></a><div>
<div class="btn"><a href="task/create"><button type="button" class="btn btn-success">Create Task</button></a></div>
<div class="btn"><a href="#"><button type="button" class="btn btn-danger">Delete Tasks</button></a></div>
<div class="btn"><a href="#"><button type="button" class="btn btn-info">Update Task</button></a></div>

</div>

</body>
</html>