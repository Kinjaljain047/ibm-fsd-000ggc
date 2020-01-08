package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.ResponseModel;



public interface CustomerService {
	public CustomerDto createCustomer(CustomerDto customer);
	public List<ResponseModel> getAllCustomers();
	public ResponseModel getCustomerById(Long id);
	public void deleteCustomer(Long id);
	public CustomerDto getCustomerByEmail(String email);
	public CustomerDto verifyUser(CustomerDto customer);
}