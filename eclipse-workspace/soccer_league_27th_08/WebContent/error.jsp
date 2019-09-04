<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
List<String> err=(List<String>)request.getAttribute("ERROR");
		for(String s:err)
		{
			out.println("<h1 style='color:red'>"+s+"</h1><br/>");
		}
			out.println("<br><a href=\"addleague.jsp\"><button type='button'>back</button></a>");
		
%>

</body>
</html>