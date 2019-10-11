package com.example.demo.patientclient;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="patient-service")
public interface PatientClient {

	@GetMapping("/viewp/{d}")
	public List<PatientData> getPatient(@PathVariable("d") String disease);
	
	@GetMapping("/viewpatient/{id}")
	public Optional<PatientData> getById(@PathVariable("id") Long id);
}
