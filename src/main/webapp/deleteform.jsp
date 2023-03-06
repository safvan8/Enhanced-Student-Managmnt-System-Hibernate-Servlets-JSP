<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<body bgcolor="lightblue">
	<br />
	<br />
	<br />
	<form method="post" action='./controller/deleteform'>
		<table align='center'>
			<tr>
				<td>Student ID</td>
				<td><input type='text' name='sid' /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type='submit' value='Delete' /></td>
			</tr>
		</table>
	</form>
</body>
</html>