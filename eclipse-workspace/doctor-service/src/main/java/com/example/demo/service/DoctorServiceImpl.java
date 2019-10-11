package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DoctorData;
import com.example.demo.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
      private DoctorRepository doctorRepository;
      
      @Autowired
      public DoctorServiceImpl(DoctorRepository doctorRepository) {
  		super();
  		this.doctorRepository = doctorRepository;
  	}
      
	@Override
	public List<DoctorData> getAllDoctor(String speciality) {
		
		return doctorRepository.findBySpeciality(speciality);
	}

	

	@Override
	public Optional<DoctorData> getDoctor(Long id) {
		
		return doctorRepository.findById(id);
	}

}
