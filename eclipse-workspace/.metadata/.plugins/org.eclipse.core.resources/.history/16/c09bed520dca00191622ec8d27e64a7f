package comm.employee.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import comm.employee.factory.MyConnectionFactory;

/**
 * Servlet Filter implementation class EmailFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/addemployee_view" })
public class EmailFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EmailFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	 String email=request.getParameter("email").toString();
	 String password= request.getParameter("password").toString();
	Connection connection= MyConnectionFactory.getMySqlConnectionForHR();
	try {
		PreparedStatement pst= connection.prepareStatement("select * from emp where email='"+email+"' and password='"+password+"'" );
	  ResultSet rs=pst.executeQuery();
	  if(rs.next()) {
			chain.doFilter(request, response);
	  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
