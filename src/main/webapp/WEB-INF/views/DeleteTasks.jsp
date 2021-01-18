<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="bootstrap.html"%>
<title>Delete Task</title>
</head>
<body style="background-color:indianred;">
<jsp:include page="HelloUser.jsp" />
<br/>
	<div class="d-flex justify-content-center align-items-center container ">
	<h2 style="color:white;">Delete: "${task.name}"</h2>
		<div class="form-control">
		<form method="post">
			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Start Date</span> 
			<input type="date" value="${task.startDate}" readOnly name="startDate" class="form-control"><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">End Date</span> 
			<input type="date" value="${task.endDate}" readOnly name="endDate" class="form-control"><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Description</span> 
			<textarea placeholder="${task.description}" readOnly name="description" class="form-control"></textarea><br /></div>
			
<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">E-mail</span> 
			<input type="email" value="${task.email}" readOnly name="email" class="form-control"><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Severity</span> 
			<input type="text" value="${task.severity}" readOnly name="severity" class="form-control"><br /></div>

<div class="btn-group">
			<div class="btn"><button type="submit" class="btn btn-danger">Delete</button></div>
		</form>
		<a href="/dashboard"><div class="btn"><button type="submit" class="btn btn-success">Dashboard</button></div></a>
	</div>
	</div>
	</div>
	</div>
</body>
</html>