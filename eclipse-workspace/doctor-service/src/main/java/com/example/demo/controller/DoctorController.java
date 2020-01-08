package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DoctorData;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/")
public class DoctorController {
  @Autowired
  private DoctorService doctorService;
  
  
  
  public DoctorController() {
	super();
}

public DoctorController(DoctorService doctorService) {
	super();
	this.doctorService = doctorService;
}

@GetMapping("/viewdoctor/{s}")
  public List<DoctorData> getDoctors(@PathVariable("s") String speciality){
	  return doctorService.getAllDoctor(speciality);
  }
  
  @GetMapping("/view/{id}")
  public Optional<DoctorData> getDoctorById(@PathVariable("id") Long id){
	  return doctorService.getDoctor(id);
  }
}