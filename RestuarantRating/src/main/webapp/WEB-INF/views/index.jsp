<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Restaurant Ratings</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/pulse/bootstrap.min.css" />
</head>
<body>
<h2>Restaurant Ratings</h2>
<table>
	<thead>
	<tr>
		<th>Restaurant</th><th>Rating</th>
	</tr>
	</thead>
	<c:forEach items="${restaurants}" var="restaurant">
	<tr>
	<td>${restaurant.name}</td><td>${restaurant.rating}</td>
	<td>
		<a href="/upvote?id=${ restaurant.id }">Upvote</a>
	</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>