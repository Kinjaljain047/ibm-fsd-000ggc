package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Receipe;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReceipeRepository extends JpaRepository<Receipe, Long>{

}
