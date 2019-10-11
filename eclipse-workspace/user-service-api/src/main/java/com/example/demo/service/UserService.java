package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.data.UserEntity;
import com.example.demo.dto.UserDto;

public interface UserService {
	public UserDto createUser(UserDto userDetail);
	public List<UserEntity> findUsers() ;
	Optional<UserEntity> findById(Long id);
	public void deleteUser(Long id);
	
}
