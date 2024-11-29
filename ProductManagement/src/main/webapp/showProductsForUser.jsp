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
			<th>Quantity</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="p" items="${pList}">
			<tr>
				<td>${p.prodId}</td>
				<td>${p.prodDesc}</td>
				<td>${p.prodPrice}</td>
				<td>
					
						<input type="text" name="p${p.prodId}" id="qty" value="0">
					
				</td>
				<td><a href="checkout?prodPrice=${p.prodPrice}&prodId=${p.prodId}&prodDesc=${p.prodDesc}">Add to cart</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="checkout">Checkout</a>
	<a href="logout">Logout</a>
<%@include file="MyFooter.html" %>
</body>
</html>