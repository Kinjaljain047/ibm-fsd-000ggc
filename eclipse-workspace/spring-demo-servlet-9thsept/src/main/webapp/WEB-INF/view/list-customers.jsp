<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>List Customers</title>
	</head>
<body>
<h2>CRM - Customer Relationship Manager</h2>
		
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<a href='/customer/showFormForAdd'><button>add customers</button></a>
			<a href='/customer/search'><button>Search Customers</button></a>
				 
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Delete</th>
					<th>Edit</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="deleteCustomer?id=${tempCustomer.id}"><button>Delete</button></a>
						<td><a href="getCustomer?id=${tempCustomer.id}"><button>Edit</button></a>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
</body>
</html>