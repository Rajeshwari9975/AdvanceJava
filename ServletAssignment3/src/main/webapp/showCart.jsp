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
			<th>Book Name</th>
			<th>Book Type</th>
			<th>Book Cost</th>
			<th>Quantity</th>
			<th>Total Amount</th>
		</tr>

		<c:set var="finalAmt" val="0"></c:set>
		<c:forEach var="b" items="${cart}">
			<tr>
				<td>${b.bookName}</td>
				<td>${b.bookType}</td>
				<td>${b.cost}</td>
				<td>${b.orderQty}</td>
				<td>${b.cost* b.orderQty}</td>
			</tr>
			<tr>
				<td colspan="3">Final Amount :</td>
				<td colspan="2">${finalAmt += b.cost* b.orderQty}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>