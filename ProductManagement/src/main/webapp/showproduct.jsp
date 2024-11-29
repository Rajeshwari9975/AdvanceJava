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
<table action= "addtocard">

<tr>
<th> Product Id</th> 
<th> Product Description</th>
<th> Product price </th>
<th>Action </th>
</tr>
<c:forEach var="p" items="${pList }">
<tr>
<td><input type="checkbox" name="prod" id="${p.prodId }" value="${p.prodId}"></td>
<td>${p.prodID }</td>
<td>${p.prodDesc }</td>
<td>${p.prodprice }</td>
</tr>
</c:forEach>
</table>
<tr>
<td colspan="2"><button type="submit" name="btn" id="add" value="add">Add to Cart</button> </td>
<td colspan="2"> <button type="submit" name="btn" id="show" value="show">Show Cart</button></td>
</tr>

</body>
</html>