package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.data.PatientData;

public interface PatientService {
  public List<PatientData> getAllPatients();
  public Optional<PatientData> findById(Long id);
  public List<PatientData> findByDisease(String disease);
}
