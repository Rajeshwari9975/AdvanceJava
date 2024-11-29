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
<%@include file="MyHeader.html" %>
	<table>
		<tr>
			<th>Product ID</th>
			<th>Product Description</th>
			<th>Product Price</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="p" items="${pList}">
			<tr>
				<td>${p.prodId}</td>
				<td>${p.prodDesc}</td>
				<td>${p.prodPrice}</td>
				<td><a href="deleteProd?pid=${p.prodId}">Delete</a>/<a
					href="editProd?pid=${p.prodId}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="logout">Logout</a>
<%@include file="MyFooter.html" %>
</body>
</html>