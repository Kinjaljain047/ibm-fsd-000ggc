package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ContractualEmployee;
import com.example.demo.model.Employee;
import com.example.demo.model.RegularEmployee;
import com.example.demo.repository.ContractualEmployeeRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RegularEmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	  private EmployeeRepository emprepo;
	  private RegularEmployeeRepository rerepo;
	  private ContractualEmployeeRepository corepo;
	  
	  @Autowired
	  public EmployeeServiceImpl(EmployeeRepository emprepo, RegularEmployeeRepository rerepo,
				ContractualEmployeeRepository corepo) {
			super();
			this.emprepo = emprepo;
			this.rerepo = rerepo;
			this.corepo = corepo;
		}

	  

	public EmployeeServiceImpl() {
		super();
	}



	



	@Override
	public List<Employee> ListAllEmployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}



	@Override
	public List<RegularEmployee> ListAllRegular() {
		
		return rerepo.findAll();
	}



	@Override
	public List<ContractualEmployee> listAllContractual() {
		
		return corepo.findAll();
	}

}
