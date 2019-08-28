package comm.employee.service;

import java.sql.SQLException;
import java.util.List;

import comm.employee.dao.EmployeeDao;
import comm.employee.dao.EmployeeDaoImpl;
import comm.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
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
	public Employee deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
