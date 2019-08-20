package comm.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemo {
	private static Properties properties= null;
	
 static  {
		properties= new Properties();
		properties.put("JDBC_URL", "jdbc://mysql://localhost:3306/hr");
		properties.put("USER", "root");
		properties.put("pass", "root");
	}

public static void main(String[] args) throws ClassNotFoundException,SQLException {
	//DriverManager.registerDriver(new org.h2.Driver());
	//Class.forName("org.h2.Driver");
	
	//Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	//Connection conn= DriverManager.getConnection("jdbc:h2:~/mydb","sa","sa");
	Connection connection= DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"), properties.getProperty("pass"));
     Statement statement=connection.createStatement();
     ResultSet resultSet=statement.executeQuery("select * from course");
       while(resultSet.next()) {
    	   System.out.println(resultSet.getInt(1)+""+resultSet.getString(2)+""+resultSet.getInt(3));
       }
}
}
