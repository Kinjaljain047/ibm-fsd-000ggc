<%@page import="comm.example.model.League"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
League league = (League) request.getAttribute("SUCCESS");
		out.println("Title"+league.getTitle()+"<br/>"+"Year"+league.getYear()
		+"<br/>Season"+league.getSeason());
%>
</body>
</html>  