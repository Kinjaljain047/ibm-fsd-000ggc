package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.UserEntity;
import com.example.demo.dto.UserDto;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;
@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> create(@RequestBody CreateUserRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto uDto=mapper.map(userDetail, UserDto.class);
		
		UserDto tempDto=userService.createUser(uDto);
		CreateUserResponseModel model=mapper.map(tempDto, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	
	@GetMapping("/view")
	
	public List<ResponseEntity<CreateUserResponseModel>> getUsers(){
		List<UserEntity> list= userService.findUsers();
		List<ResponseEntity<CreateUserResponseModel>> rlist=new ArrayList<ResponseEntity<CreateUserResponseModel>>();
		ModelMapper mapper= new ModelMapper();
		for(UserEntity u: list) {
			CreateUserResponseModel res= mapper.map(u,CreateUserResponseModel.class);
			rlist.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return rlist;
	}
	
	@GetMapping("/view/{id}")
	public Optional<UserEntity> findUser(@PathVariable("id") Long userId){
		
		Optional<UserEntity> user= userService.findById(userId);
		return user;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Long id){
	 userService.deleteUser(id);
     }
	
	
}
