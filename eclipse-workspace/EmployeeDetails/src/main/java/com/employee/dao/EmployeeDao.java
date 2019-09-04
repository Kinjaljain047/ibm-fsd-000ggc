package com.employee.dao;

import java.util.List;

import com.ibm.fsd.EmployeeDetails.Employee;

public interface EmployeeDao {
public void createEmployee(Employee e);
public Employee getEmployeeById(int id);
public void deleteEmployee(int id);
public List<Employee> getAllEmployees();
}
