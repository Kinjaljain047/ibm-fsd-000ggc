package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.factory.MyConnectionFactory;

/**
 * Servlet implementation class ListLeague
 */
@WebServlet("/listleague.view")
public class ListLeague extends HttpServlet {
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
			doProcess(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		ResultSet rs=null;
		Statement stmt=null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection connection= MyConnectionFactory.getMySqlConnectionForHR();
		stmt= connection.createStatement();
		rs= stmt.executeQuery("select * from league");
		out.println("<table><tr><th>Title</th><th>Season</th><th>Year</th></tr>");
		while(rs.next()) {
			out.println("<tr><td>"+rs.getObject(2).toString()+"</td><td>"+rs.getObject(3).toString()+"</td><td> "+rs.getObject(4)+"</td><td>"+rs.getObject(5)+"</td><td>"+"<br><a href=\"delete_league.view\"><button type='button'>Delete</button></a>"+"</td></tr>");
			out.println("</table>");
		}
	}

}
