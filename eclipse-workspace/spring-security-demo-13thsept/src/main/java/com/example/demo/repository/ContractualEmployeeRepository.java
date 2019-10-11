package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ContractualEmployee;

@Repository
public interface ContractualEmployeeRepository extends JpaRepository<ContractualEmployee, Long> {

}
