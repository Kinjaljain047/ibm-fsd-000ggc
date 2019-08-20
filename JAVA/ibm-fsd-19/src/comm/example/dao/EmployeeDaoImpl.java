package comm.example.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.Employee;
import com.example.MyConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {
 private MyConnectionFactory factory= null;
 private Connection connection= null;
 private PreparedStatement pStatement = null;
 private ResultSet resultset=null;
 
 public EmployeeDaoImpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
	}

	

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			Statement statement = connection.createStatement();
			resultset=statement.executeQuery("select * from employee");
			while(resultset.next())
			{
				list.add(new Employee(resultset.getInt(1), resultset.getString(2),
						resultset.getString(3), resultset.getString(4)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}
	
	public void getConnectionInfo() {
		try {
			DatabaseMetaData dMetaData= connection.getMetaData();
			System.out.println(dMetaData.getDatabaseProductName());
			System.out.println(dMetaData.getDatabaseMajorVersion()+ ""+dMetaData.getDatabaseMinorVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		try {
			Statement statement= connection.createStatement();
			resultset = statement.executeQuery("select * from employee");
			while(resultset.next()) 
				if(resultset.getInt(1)==id) {
				  return new Employee(resultset.getInt(1), resultset.getString(2),
						resultset.getString(3), resultset.getString(4));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}



	@Override
	public void createEmployee(Employee employee) {
	try {
		pStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
		pStatement.setInt(1, employee.getId());
		pStatement.setString(2, employee.getFname());
		pStatement.setString(3, employee.getLname());
		pStatement.setString(4, employee.getEmail());
		pStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		System.out.println("duplicate id");
		
		e.printStackTrace();
	} finally {
		
	}
		
		
	}

}

