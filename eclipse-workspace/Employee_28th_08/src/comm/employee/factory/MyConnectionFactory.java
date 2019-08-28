package comm.employee.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyConnectionFactory {
	 private static javax.sql.DataSource datasource=null;
	  private static Connection connection=null;
	  
	  public static Connection getMySqlConnectionForHR() {
		  try{
			 Context initContext=new InitialContext();
			 Object o= initContext.lookup("java:/comp/env/jdbc/mysql");
			 datasource=(javax.sql.DataSource)o;
			 connection= datasource.getConnection();
		  }catch(NamingException ne) {
			  ne.printStackTrace();
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
		  return connection;
	  }
}
