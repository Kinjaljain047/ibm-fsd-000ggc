package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.demo.model.RegularEmployee;

@Repository
public interface RegularEmployeeRepository extends JpaRepository<RegularEmployee, Long> {

}
