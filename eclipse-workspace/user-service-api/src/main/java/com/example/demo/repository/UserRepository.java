package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.example.demo.data.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
 
}
