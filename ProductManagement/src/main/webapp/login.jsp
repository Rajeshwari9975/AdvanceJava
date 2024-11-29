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

<form action="validate" method="post">
Username : <input type="text" name="uname" id="uname" value="uname">
<br>
Password : <input type="password" name="pwd" id="pwd" value="pwd">
<button type="submit" value="btn" name="btn">Submit</button>
</form>

<%@include file="MyFooter.html" %>
</body>
</html>