package comm.employee.service;

import java.util.List;

import comm.employee.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee deleteEmployeeById(int id);
}
