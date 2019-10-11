package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.ErrorModel;
import com.example.demo.model.RequestModel;
import com.example.demo.model.ResponseModel;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
   @Autowired
   CustomerService customerService;
   
   @PostMapping("/create")
   public ResponseEntity<?> createCustomer(@RequestBody RequestModel request){
	   ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CustomerDto custdto= mapper.map(request, CustomerDto.class);
		CustomerDto cdto= customerService.createCustomer(custdto);
		if(cdto==null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorModel("email already exists"));
		}else {
			ResponseModel cResponse = mapper.map(cdto, ResponseModel.class);
			return ResponseEntity.status(HttpStatus.CREATED).body(cResponse);
		}
   }
   
   @GetMapping("/customers")
   public ResponseEntity<?> getAllCustomers(){
	   List<ResponseModel> rlist= customerService.getAllCustomers();
	   return ResponseEntity.status(HttpStatus.CREATED).body(rlist);
   }
   
   @RequestMapping("/login")
   public ResponseEntity<?> verifyUser(@RequestBody RequestModel request){
	   ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CustomerDto custdto= mapper.map(request, CustomerDto.class);
		CustomerDto cdto= customerService.verifyUser(custdto);
		if(cdto!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(cdto);
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorModel("Wrong Credentials"));
		}
   }
   
   @GetMapping("/delete/{id}")
   
   public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id){
	   customerService.deleteCustomer(id);
	   return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorModel("Customer Deleted!!"));
   }
   
   @PostMapping("/search")
   public ResponseEntity<?> getCustomerByEmail(@RequestBody RequestModel request){
	   CustomerDto cdto= customerService.getCustomerByEmail(request.getEmail());
	   if(cdto==null) {
		   return ResponseEntity.status(HttpStatus.CREATED).body(new ErrorModel("Email not found!!"));
	   }else {
		   return ResponseEntity.status(HttpStatus.CREATED).body(cdto);
	   }
   }
}
