package comm.employee.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.employee.dao.EmployeeDao;
import comm.employee.dao.EmployeeDaoImpl;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete_employee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		EmployeeDao emps= new EmployeeDaoImpl();
		String id= request.getParameter("id");
		int id_=Integer.parseInt(id);
	out.println(id_);
		emps.deleteEmployeeById(id_);
		RequestDispatcher  view=request.getRequestDispatcher("list_employee");
		view.forward(request, response);
	}

}
