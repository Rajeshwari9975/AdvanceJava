<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<th>Product Quantity</th>
			<th>Total Price</th>
		</tr>

		<c:forEach var="p" items="${pcList}">
			<tr>
				<td>${p.prodId}</td>
				<td>${p.prodDesc}</td>
				<td>${p.prodPrice}</td>
				<td>${p.qty}</td>
				<td>${p.totalPrice}</td>
			</tr>
		</c:forEach>
	</table>
	<h1>Total Payable Amount:: "${finalAmt}"</h1>
	<a href="logout">Logout</a>
<%@include file="MyFooter.html" %>
</body>
</html>