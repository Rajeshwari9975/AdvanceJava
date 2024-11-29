<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Account ID</th>
			<th>Account Name</th>
			<th>Email</th>
			<th>Account Balance</th>
		</tr>

		<c:forEach var="a" items="${acList}">
			<tr>
				<td>${a.aid}</td>
				<td>${a.name}</td>
				<td>${a.email}</td>
				<td>${a.balance}</td>
				<td><a href="deleteAccount?aid=${a.aid}">Delete</a>/<a
					href="withdrawAmount?aid=${a.aid}">Edit</a>/<a
					href="depositAmount?aid=${a.aid}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

	<a href="addAccount.jsp">Add New Account</a>

</body>
</html>