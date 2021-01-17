<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Tasks</title>
</head>
<body>
<div>
<form method="post">
	<table>
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
	<div>
	<button type="submit" name="manage" value="Delete">Delete Task</button>
	<button type="submit" name="manage" value="Update">Update Task</button>
	</div>
</form>
<a href="/task/create"><button type="submit" name="manage" value="Create">Create Task</button></a>
</div>
	
<!-- 	<form method="post" action="/task/delete"> -->
<!-- 	<button type="submit">Delete Tasks</button> -->
<!-- 	</form> -->
<!-- 	<form method="get" action="/task/update"> -->
<!-- 	<button type="submit">Update Task</button> -->
<!-- 	</form> -->
	

</body>
</html>
<%-- 	<c:forEach items="${taskList}" var="taskList"> --%>
<%-- 		<c:out value="${taskList}" /> --%>
<%-- 		<%--    <c:out value="${taskList.startDate}"/> --%>
<%-- 	</c:forEach> --%>