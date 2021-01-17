<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://unpkg.com/@popperjs/core@2"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous">
	</script>
<title>Update Task</title>
</head>
<body>
	<div class="">
		<form method="post">
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">Task</span>
				<input type="text" name="name" value= required placeholder="${task.name}"><br />
			</div>

			<input type="date" placeholder="${task.startDate}" name="startDate"><br />
			<input type="date" placeholder="${task.endDate}" name="endDate"><br />
			<textarea placeholder="${task.description}" name="description"></textarea><br />
			<input type="email" placeholder="${task.email}" name="email"><br />

			<div class="container-fluid">
				<label for="exampleDataList" class="form-label">Severity</label>
				<input class="form-control" list="datalistOptions" id="exampleDataList" placeholder="${task.severity}">
				<datalist id="datalistOptions" >
					<option value="High">
					<option value="Medium">
					<option value="Low">
				</datalist>
			</div>
			<button type="reset" class="btn btn-danger">Reset</button><br />
			<button type="submit" class="btn btn-primary">Submit</button>
			<br />
		</form>
	</div>
</body>
</html>