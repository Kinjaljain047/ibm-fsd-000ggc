<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="searchCustomer" >
Search text:<input type="text" name="data" placeholder="search here"/>
search by:
<input type="radio" value="firstName" name="search"/>firstname
<input type="radio" value="lastName" name="search"/>lastname
<input type="radio" value="email" name="search"/>email
<input type="submit"/>
</form>
</body>
</html>