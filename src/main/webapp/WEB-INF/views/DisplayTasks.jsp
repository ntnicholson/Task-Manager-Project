<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="bootstrap.html"%>
<title>Display Tasks</title>
</head>
<body>
<jsp:include page="HelloUser.jsp" />
<br/>
<div class="container">
<form method="post">
	<table class="table table-striped">
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Description</th>
				<th>E-mail</th>
				<th>Severity</th>
				<th>Manage</th>
			</tr>
			<c:forEach items="${taskList}" var="taskList">
				<tr>
					<td><c:out value="${taskList.id}"></c:out></td>
					<td><c:out value="${taskList.name}"></c:out></td>
					<td><c:out value="${taskList.startDate}"></c:out></td>
					<td><c:out value="${taskList.endDate}"></c:out></td>
					<td><c:out value="${taskList.description}"></c:out></td>
					<td><c:out value="${taskList.email}"></c:out></td>
					<td><c:out value="${taskList.severity}"></c:out></td>
					<td><input type="radio" name="id" value="${taskList.id}" ></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>
	<div class="btn">
	<button  type="submit" name="manage" value="Delete" class="btn btn-danger">Delete Task</button>
	</div>
	<div class="btn">
	<button type="submit" name="manage" value="Update" class="btn btn-primary">Update Task</button>
	</div>
</form>
<div class="btn">
<a href="/task/create"><button type="submit" name="manage" value="Create" class="btn btn-success">Create Task</button></a>
</div>
</div>
</div>
</body>
</html>