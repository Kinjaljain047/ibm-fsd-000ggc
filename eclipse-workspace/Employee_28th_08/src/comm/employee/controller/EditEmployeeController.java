package comm.employee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employee.dao.EmployeeDao;
import comm.employee.dao.EmployeeDaoImpl;
import comm.employee.model.Employee;

/**
 * Servlet implementation class EditEmployeeController
 */
@WebServlet("/editemployee.controller")
public class EditEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name,email,password,country;
	private List<String> errmessage;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		errmessage= new LinkedList<String>();
		response.setContentType("text/html");
	      country=request.getParameter("country");
		if(country.equals("unknown")) {
			errmessage.add("please select a valid country");
		}
		
		name= request.getParameter("name");
		if(name.toString().length()<5) {
			errmessage.add("name is too short");
		}
		
		
		email= request.getParameter("email");
		password= request.getParameter("password");
		if(errmessage.isEmpty()) {
			
				request.setAttribute("SUCCESS", new Employee(name, email, password,country));
				EmployeeDao emps= new EmployeeDaoImpl();
				emps.editEmployee(new Employee(name, email, password,country));
				RequestDispatcher  view=request.getRequestDispatcher("success.view");
				view.forward(request, response);
			}
			else {
				request.setAttribute("ERROR", errmessage);
				RequestDispatcher view=request.getRequestDispatcher("error.view");
				view.forward(request, response);
			}

	}


}
