<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="detailsform" modelAttribute="student">
first name<form:input path="firstname"/><br/>
last name<form:input path="lastname"/><br/>

<form:select path="country">
	<form:options items="${student.countryOptions}"/>
</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>
		Operating Systems:
		 Linux <form:checkbox path="operatingSystems" value="Linux"/>
		  Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		   Windows <form:checkbox path="operatingSystems" value="Windows"/>
		   <br><br>

<br/>
<input type="submit"/>
</form:form>
<a href="list">List All Students</a>
<a href="search">search student</a>
</body>
</html>