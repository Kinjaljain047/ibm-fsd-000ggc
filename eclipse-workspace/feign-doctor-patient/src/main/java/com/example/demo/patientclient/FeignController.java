package com.example.demo.patientclient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	@Autowired
	FeignService pService;

	@GetMapping("/viewp/{d}")
	public List<PatientData> getPatient(@PathVariable("d") String disease) {
		return pService.getPatient(disease);
	}

	@GetMapping("/viewpatient/{id}")
	public Optional<PatientData> getById(@PathVariable("id") Long id) {
		return pService.getById(id);
	}
	
	@GetMapping("/viewdoctor/{s}")
	  public List<DoctorData> getDoctors(@PathVariable("s") String speciality){
		return pService.getDoctors(speciality);
		
	}
	
	 @GetMapping("/viewd/{id}")
	  public Optional<DoctorData> getDoctorById(@PathVariable("id") Long id){;
	  return pService.getDoctorById(id);
	
	
}
}
