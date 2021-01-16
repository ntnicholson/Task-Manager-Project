<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Create Task</title>
	<script src="https://unpkg.com/@popperjs/core@2"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous">
	</script>
</head>

<body>
	<div class="">
		<form>
			<div class="input-group mb-3">
				<span class="input-group-text" id="basic-addon1">Task</span>
				<input type="text" name="name" required><br />
			</div>

			<input type="date" placeholder="Start Date" name="startDate"><br />
			<input type="date" placeholder="End Date" name="endDate"><br />
			<textarea placeholder="Description..." name="description"></textarea><br />
			<input type="email" placeholder="Email..." name="email"><br />

			<div class="container-fluid">
				<label for="exampleDataList" class="form-label">Datalist example</label>
				<input class="form-control" list="datalistOptions" id="exampleDataList" placeholder="Type to search...">
				<datalist id="datalistOptions">
					<option value="High">
					<option value="Medium">
					<option value="Low">
				</datalist>
			</div>
			<button type="reset" class="btn btn-danger">Clear</button><br />
			<button type="submit" class="btn btn-primary">Submit</button>
			<br />
		</form>
	</div>
</body>
</html>