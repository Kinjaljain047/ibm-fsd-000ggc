package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.PatientData;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/")
public class PatientController {
	
	@Autowired
    private PatientService patientService;
	
	@GetMapping("/view/{d}")
	public List<PatientData> getPatient(@PathVariable("d") String disease){
		
		return patientService.findByDisease(disease);
	}
    
	@GetMapping("/viewpatient/{id}")
	public Optional<PatientData> getById(@PathVariable("id") Long id){
		return patientService.findById(id);
	}
    
}
