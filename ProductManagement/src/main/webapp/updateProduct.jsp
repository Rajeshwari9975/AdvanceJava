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
	<form action="updateProd" method="post">
		Product Id :<input type="text" name="pid" id="pid"
			value="${prod.prodId }"> <br> Product Decsription:<input
			type="text" name="pname" id="pname" value="${prod.prodDesc}">
		<br> Product Price :<input type="text" name="price" id="price"
			value="${prod.prodPrice}"> <br>
		<button type="submit">Update</button>
	</form>
	<a href="logout">Logout</a>
<%@include file="MyFooter.html" %>
</body>
</html>