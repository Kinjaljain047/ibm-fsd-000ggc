package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.DoctorData;

public interface DoctorService {
  public List<DoctorData> getAllDoctor(String speciality);
  public Optional<DoctorData> getDoctor(Long id);
}
