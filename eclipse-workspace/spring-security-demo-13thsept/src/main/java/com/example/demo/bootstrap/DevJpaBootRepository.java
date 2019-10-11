package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.ContractualEmployee;
import com.example.demo.model.Employee;
import com.example.demo.model.RegularEmployee;
import com.example.demo.repository.ContractualEmployeeRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.RegularEmployeeRepository;

@Component
public class DevJpaBootRepository implements ApplicationListener<ContextRefreshedEvent> {
  
	private EmployeeRepository employeeRepository;
	private ContractualEmployeeRepository contractualEmployeeRepository;
	private RegularEmployeeRepository regularEmployeeRepository;
	


    public DevJpaBootRepository(EmployeeRepository employeeRepository,
			ContractualEmployeeRepository contractualRepository, RegularEmployeeRepository regularRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.contractualEmployeeRepository = contractualRepository;
		this.regularEmployeeRepository = regularRepository;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
     
	public void init() {
		Employee e= new Employee("rahul","rahul@gg.com");
		RegularEmployee re= new RegularEmployee("raj","raj@gg.com","20000","200");
		ContractualEmployee ce= new ContractualEmployee("sam","sam@gg.com","15000","10 months");
		
		employeeRepository.save(e);
	   regularEmployeeRepository.save(re);
	   contractualEmployeeRepository.save(ce);
	}
	
	
	
}
