<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, com.student.beans.Student"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>DOB</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			
		
<c:forEach var="s" items="${studLst}" >
			<tr>
				<td><p>${s.id}</p></td>
				<td><p>${s.fName}</p></td>
				<td><p>${s.lName}</p></td>
				<td><p>${s.dob}</p></td>
				<td><p>${s.email}</p></td>
			</tr>

	</c:forEach>		

		</tbody>
	</table>



</body>
</html>