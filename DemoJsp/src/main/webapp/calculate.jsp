<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%!
public int fact(int n){
	int fact = 1;
	for(int i =1;i<=n;i++){
		fact = fact*i;
	}
	return fact;
}


%>
<%
String btn = request.getParameter("btn");

if(btn.equals("fact")){
	int n = Integer.parseInt(request.getParameter("num1"));
	int m = fact(n);%>
	Factorial<%= m %>
<%}%>




</body>
</html>