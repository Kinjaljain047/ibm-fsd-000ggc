package comm.employee.dao;

import java.util.List;

import comm.employee.model.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployeeById(int id);
	public void editEmployee(Employee emp);
	public Employee getEmployeeById(int id);
}
