package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.PatientData;
import com.example.demo.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService{
    private PatientRepository patientRepository;
    
    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	
	@Override
	public List<PatientData> getAllPatients() {
		
		return patientRepository.findAll();
	}

	
	@Override
	public Optional<PatientData> findById(Long id) {
		
		return patientRepository.findById(id);
	}

	@Override
	public List<PatientData> findByDisease(String disease) {
		
		return patientRepository.findByDisease(disease);
	}

}
