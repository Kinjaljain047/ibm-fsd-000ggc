package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListLeague
 */
@WebServlet( "/list_leagues.view" )
public class ListLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		List<League> list= new ArrayList<League>();
		list.add(new League("Soccer League",2009,"Summer"));
		list.add(new League("Swimming League",2009,"Summer"));
		list.add(new League("Basketball League",2009,"Summer"));
		list.add(new League("Beachvolley League",2009,"Summer"));
		out.println("<table><tr><td>Title</td><td>year</td><td>season</td></tr>");
		for(League l: list) {
			out.println("<tr><td>"+l.getTitle()+ "</td><td>"+l.getYear()+ "</td><td>"+l.getSeason()+ "</td></tr>");
		}
		out.println("</table>");
		
	}

}
