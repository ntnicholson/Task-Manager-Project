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
<title>Dashboard</title>
</head>
<body>
<h1>Hello</h1>
<% out.print(name); %>
<br/>
<a href="task/display"><button>Display Task</button></a>
<a href="task/create"><button>Create Task</button></a>
<a href="task/delete"><button>Delete Tasks</button></a>
<a href="task/update"><button>Update Task</button></a>
</body>
</html>