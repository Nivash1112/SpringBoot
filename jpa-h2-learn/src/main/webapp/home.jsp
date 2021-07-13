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
<h2>Feed Details</h2>
<form action="addData">
	<table>
		<tr>
			<td>Intern ID</td>
			<td><input type="number" name="internId"/></td>
		</tr>
		<tr>
			<td>Intern Name</td>
			<td><input type="text" name="internName"/></td>
		</tr>
		<tr>
			<td>Intern Mail</td>
			<td><input type="text" name="internMail"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	
	</table>
	
</form>
<br>

<h2>Find By ID</h2>
<form action="findById">
<table>
	<tr>
		<td>Intern Id</td>
		<td><input type="number" name="internId" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="submit" /></td>
	</tr>
	
</table>
</form>
<br>
<h2>Delete By Id</h2>
<form action="deleteById">
<table>
	<tr>
		<td>Intern Id</td>
		<td><input type="number" name="internId" /></td>
	</tr>
	<tr><td><input type="submit" value="submit" /> <td></tr>
	
	
</table>
</form>
</center>

</body>
</html>