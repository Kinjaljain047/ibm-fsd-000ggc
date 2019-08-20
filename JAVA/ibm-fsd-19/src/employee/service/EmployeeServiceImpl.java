package employee.service;

import java.sql.SQLException;
import java.util.List;

import com.example.Employee;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeDaoImpl dao = null;

public EmployeeServiceImpl() throws SQLException{
	super();
	dao= new EmployeeDaoImpl();
}

@Override
public void createEmployee(Employee employee) {
	dao.createEmployee(employee);
	
}

@Override
public List<Employee> getAllEmployees() {
	return dao.getAllEmployees();
}

@Override
public Employee getEmployeeById(int id) {

	return dao.getEmployeeById(id);
}

   
   
   
}
