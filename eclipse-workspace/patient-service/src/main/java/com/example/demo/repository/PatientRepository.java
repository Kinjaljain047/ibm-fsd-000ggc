package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.PatientData;
@Repository
public interface PatientRepository extends JpaRepository<PatientData,Long>{
  List<PatientData> findByDisease(String disease);
}
