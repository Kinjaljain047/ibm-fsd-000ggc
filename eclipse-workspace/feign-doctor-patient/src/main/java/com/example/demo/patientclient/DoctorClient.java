package com.example.demo.patientclient;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="doctor-service")
public interface DoctorClient {
	
	@GetMapping("/viewdoctor/{s}")
	  public List<DoctorData> getDoctors(@PathVariable("s") String speciality);
	
	
		  
	 @GetMapping("/viewd/{id}")
	  public Optional<DoctorData> getDoctorById(@PathVariable("id") Long id);
	  
}
