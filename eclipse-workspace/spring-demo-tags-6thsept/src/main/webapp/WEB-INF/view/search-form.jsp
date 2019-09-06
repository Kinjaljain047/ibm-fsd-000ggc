<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
<form action="searchstudent" >
Search text:<input type="text" name="data" placeholder="search here"/>
search by:
<input type="radio" value="firstname" name="search"/>firstname
<input type="radio" value="lastname" name="search"/>lastname
<input type="submit"/>
</form>
</body>
</html>