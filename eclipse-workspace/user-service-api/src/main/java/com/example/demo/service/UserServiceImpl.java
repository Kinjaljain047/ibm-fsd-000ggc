package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.data.UserEntity;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	private Environment env;
	private UserRepository userRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	public UserServiceImpl(Environment env, UserRepository userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public UserDto createUser(UserDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setUserId(UUID.randomUUID().toString());
		String bPass=bCryptPasswordEncoder.encode(userDetail.getPassword());
		userDetail.setBcrypetedPassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserEntity userEntity=mapper.map(userDetail, UserEntity.class);
		userEntity.setPassword(userDetail.getBcrypetedPassword());
		userRepository.save(userEntity);
		UserDto uDto=mapper.map(userEntity, UserDto.class);
		
		return uDto;
}

	@Override
	public List<UserEntity> findUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findById(Long id) {
		
		return  userRepository.findById(id);
	}

	@Override
	public void deleteUser(Long id) {
		UserEntity user= new UserEntity();
		Optional<UserEntity> u= userRepository.findById(id);
		if(u.isPresent()) {
		 userRepository.delete(u.get());
		 System.out.println("deleted");
		}else {
			System.out.println("result is not present");
		}
	}
}
