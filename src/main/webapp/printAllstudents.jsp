
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center">
		<tr style="font-size: 43; font-weight: bold;"green" bordercolor="red" border="2">
			<th width="50">SID</th>
			<th width="100">Name</th>
			<th width="50">Age</th>
		</tr>
		<tbody>
			<c:forEach items="${studentList}" var="student">
				<tr style="font-size: 43" bgcolor="lightyellow">
					<td width="50">${student.sid}</td>
					<td width="100">${student.sname}</td>
					<td width="50">${student.sage}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>