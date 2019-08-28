package comm.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.employee.factory.MyConnectionFactory;
import comm.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private MyConnectionFactory factory = null;
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public EmployeeDaoImpl() throws SQLException {
		super();
		connection= MyConnectionFactory.getMySqlConnectionForHR();
	}

	@Override
	public void createEmployee(Employee employee) {
		try {
			//System.out.println(employee.getCountry()+","+employee.getEmail()+","+employee.getName()+","+employee.getPassword());
			pStatement = connection.prepareStatement("insert into emp (name,email,password,country) values (?,?,?,?)");
			pStatement.setString(1, employee.getName());
			pStatement.setString(2, employee.getEmail());
			pStatement.setString(3, employee.getPassword());
			pStatement.setString(4, employee.getCountry());
			pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("duplicate id");

			e.printStackTrace();
		} 

		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from emp");
			
			while (resultSet.next()) {
				list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getString(5)));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteEmployeeById(int id) {
		try {
			PreparedStatement pst= connection.prepareStatement("delete from emp where id=?");
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void editEmployee(Employee emp) {
		try {
			PreparedStatement pst= connection.prepareStatement("update emp set name=?, email=?, password=?,country=? where id=?");
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getEmail());
			pst.setString(3, emp.getPassword());
			pst.setString(4, emp.getCountry());
			pst.setInt(5, emp.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee em= new Employee();
		try {
			PreparedStatement pst= connection.prepareStatement("select * from emp where id=?");
			pst.setInt(1, id);
			ResultSet rs= pst.executeQuery();
			 if(rs.next()){  
	                em.setId(rs.getInt(1));  
	                em.setName(rs.getString(2));  
	                em.setEmail(rs.getString(3));  
	                em.setPassword(rs.getString(4));  
	                em.setCountry(rs.getString(5));  
	            }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return em;
	}

	
	
	
	
}
