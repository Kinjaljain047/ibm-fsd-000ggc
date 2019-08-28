package comm.employee.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employee.model.Employee;


/**
 * Servlet implementation class SuccessEmployee
 */
@WebServlet("/success.view")
public class SuccessEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Employee employee = (Employee) request.getAttribute("SUCCESS");
		out.println("<table><tr><th>Name</th><th>Email</th><th>Password</th><th>Country</th></tr>");
		out.println("<tr><td>"+employee.getName()+"</td><td>"+employee.getEmail()+"</td><td>"+employee.getPassword()+"</td><td>"+employee.getCountry()+"</td></tr>");

	
		
		out.println("<br><a href=\"list_employee\"><button type='button'>list employees</button></a>");
	out.println("<br><a href=\"Login.html\"><button type='button'>back</button></a>");
	
	}
	}

