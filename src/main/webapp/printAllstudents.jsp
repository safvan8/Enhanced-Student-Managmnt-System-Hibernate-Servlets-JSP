
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th>SID</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
		<tbody>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.sid}</td>
					<td>${student.sname}</td>
					<td>${student.sage}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>