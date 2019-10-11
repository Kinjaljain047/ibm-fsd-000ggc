package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ContractualEmployee;
import com.example.demo.model.Employee;
import com.example.demo.model.RegularEmployee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	  @Autowired 
  private EmployeeService emps;

  


@GetMapping("/")
public String listEmployee(Model theModel) {
	List<Employee> list=emps.ListAllEmployee();
	List<RegularEmployee> rlist=emps.ListAllRegular();
	List<ContractualEmployee> clist=emps.listAllContractual();
	theModel.addAttribute("elist", list);
	theModel.addAttribute("rrlist", rlist);
	theModel.addAttribute("cclist", clist);
	return "view/home";
}
  
}
