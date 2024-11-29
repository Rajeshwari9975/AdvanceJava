<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.html" %>
<form action="validation" method="post">
Username:<input type="text" id ="uname" name="uname" value="uname">
<br>
Password: <input type="password" id ="pwd" name ="pwd" value="pwd">
<button type="submit" id ="submit" name="btn">Submit</button>

</form>
<%@include file ="Footer.html" %>
</body>
</html>