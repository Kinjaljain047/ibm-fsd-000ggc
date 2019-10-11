package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ContractualEmployee;
import com.example.demo.model.Employee;
import com.example.demo.model.RegularEmployee;
import com.example.demo.repository.EmployeeRepository;

public interface EmployeeService {
	
  public List<Employee> ListAllEmployee();
  public List<RegularEmployee> ListAllRegular();
  public List<ContractualEmployee> listAllContractual();
}
