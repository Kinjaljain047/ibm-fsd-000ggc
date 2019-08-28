package comm.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDemo {
	private static Properties properties= null;
	private static Scanner sc= new Scanner(System.in);
	
	
 static  {
		properties= new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/hr");
		properties.put("USER", "root");
		properties.put("pass", "root");
	}
 public JdbcDemo() {
	 super();
 }

public static void main(String[] args) throws ClassNotFoundException,SQLException {
	//DriverManager.registerDriver(new org.h2.Driver());
	//Class.forName("org.h2.Driver");
	
	//Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	//Connection conn= DriverManager.getConnection("jdbc:h2:~/mydb","sa","sa");
	//Connection connection= DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"), properties.getProperty("pass"));
     //Statement statement=connection.createStatement();
     //ResultSet resultSet=statement.executeQuery("select * from course");
       //while(resultSet.next()) {
    	 //  System.out.println(resultSet.getInt(1)+""+resultSet.getString(2)+""+resultSet.getInt(3));

	MySqlConnectionFactory factory=MySqlConnectionFactory.createConnection();
	
	
	Connection connection=factory.getConnection();
	PreparedStatement pst=connection.prepareStatement("insert into student values(?,?,?)");
	System.out.print("ID: ");
	int id=sc.nextInt();
	System.out.print("NAME: ");
	String name=sc.next();
	System.out.print("AMOUNT: ");
	int amount=sc.nextInt();
	pst.setInt(1, id);
	pst.setString(2, name);
	pst.setInt(3, amount);
	int count=pst.executeUpdate();
	System.out.println(count+" row(s) updated");
	
	System.out.println("enter id to be deleted:");
	id= sc.nextInt();
	PreparedStatement pt= connection.prepareStatement("delete from student where id = (?)");
	pt.setInt(1,id);
	count= pt.executeUpdate();
	System.out.println(count+ "row(s) updated");
	
	System.out.println("enter id to be updated:");
	id=sc.nextInt();
	PreparedStatement ps= connection.prepareStatement("update student SET amount=(?) where id=(?)");
	System.out.println("enter amount to be updated:");
	amount=sc.nextInt();
	ps.setInt(1,amount);
	ps.setInt(2, id);
	count= ps.executeUpdate();
	System.out.println(count+ "row(s) updated");
	
	System.out.println("enter id to be searched:");
	id= sc.nextInt();
	PreparedStatement pps= connection.prepareStatement("select * from student where id=(?)");
		pps.setInt(1, id);
	    count = pps.executeUpdate();
	   System.out.println(count+ "row(s) updated");
	

}

}

