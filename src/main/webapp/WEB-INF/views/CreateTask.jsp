<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Create Task</title>
<%@ include file="bootstrap.html"%>
</head>
<body style="background-color:forestgreen;">
<jsp:include page="HelloUser.jsp" />
<br/>
	<div class="d-flex justify-content-center align-items-center container ">
	<h2 style="color:white;"> Create Task </h2>
		<div class="form-control">
		<form method="post">
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">Task</span> 
				<input type="text" name="name" class="form-control" required><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Start Date</span> 
			<input type="date" placeholder="Start Date" name="startDate" class="form-control"><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">End Date</span> 
			<input type="date" placeholder="End Date" name="endDate" class="form-control"><br /></div>

			<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Description</span> 
			<textarea placeholder="Write task here..." name="description" class="form-control"></textarea><br /></div>
			
<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">E-mail</span> 
			<input type="email" placeholder="Email..." name="email" class="form-control"><br /></div>

			<div class="form-group">
			<label for="severity">Select Severity:</label>
				<select name="severity" id="severity" class="form-control" required>
					<option value="High">High</option>
					<option value="Medium">Medium</option>
					<option value="Low">Low</option>
				</select>
				</div>

		<div class="btn btn-group">
			<div class="btn"><button type="reset" class="btn btn-danger form-control">Clear</button></div>
			<br />
			<div class="btn"><button type="submit" class="btn btn-primary">Submit</button></div>
			<br />
			</div>
		</form>
	</div>
	</div>
	</div>
</body>
</html>