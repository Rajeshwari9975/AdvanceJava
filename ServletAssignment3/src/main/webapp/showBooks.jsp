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
	<form action="addToCart">
		<table>
			<tr>
				<th></th>
				<th>Book ID</th>
				<th>Book Name</th>
				<th>Book Type</th>
				<th>Book Cost</th>
				<th></th>
			</tr>

			<c:forEach var="b" items="${blst}">
				<tr>
					<td><input type="checkbox" name="books" id="${b.id}"
						value="${b.id}"></td>
					<td>${b.id}</td>
					<td>${b.bookName}</td>
					<td>${b.type}</td>
					<td>${b.cost}</td>
					<td><input type="text" name="b${b.id}"></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2"><button type="submit" name="btn" value="add">Add to Cart</button></td>
				<td colspan="2"><button type="submit" name="btn" value="show">Show Cart</button></td>
			</tr>
		</table>

	</form>

	<a href="logout">Logout</a>
</body>
</html>