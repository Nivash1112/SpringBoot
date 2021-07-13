<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Intern Details by Id</h1>
<br>
<table>
	<tr>
		<td>Id</td>
		<td>${intern.internId}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>${intern.internName}</td>
	</tr>
	<tr>
		<td>Mail</td>
		<td>${intern.internMail}</td>
	</tr>
</table>
</center>
</body>
</html>