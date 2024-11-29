<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="showBooks">

<label for="books">Choose a Book Type</label>
<select name="books">
<option value="Hardcover">Hardcover</option>
<option value="Paperback">Paperback</option>
</select>

<button type="submit" name="btn" value="showBooks">Show Books</button>
<button type="submit" name="btn" value="showCart">Show Cart</button>
</form>

</body>
</html>