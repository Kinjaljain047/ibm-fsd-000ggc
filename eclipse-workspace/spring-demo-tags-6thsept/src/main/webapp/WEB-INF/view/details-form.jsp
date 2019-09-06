<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
first name:${tempStudent.firstname}
last name:${tempStudent.lastname}
<br><br>

Country: ${tempStudent.country}

<br><br>

Favorite Language: ${tempStudent.favoriteLanguage}
<br><br>

operating system:
<c:forEach var="os" items="${tempStudent.operatingSystems}">
<li>${os} </li>
</c:forEach>

</body>
</html>