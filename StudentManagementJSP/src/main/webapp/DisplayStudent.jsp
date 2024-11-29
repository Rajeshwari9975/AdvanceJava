<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, com.student.beans.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Student> studLst = (List<Student>) request.getAttribute("studLst");
	%>

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
			<%
			for (Student s : studLst) {
			%>

			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getfName()%></td>
				<td><%=s.getlName()%></td>
				<td><%=s.getDob()%></td>
				<td><%=s.getEmail()%></td>
			</tr>

			<%
			}
			%>

		</tbody>
	</table>



</body>
</html>