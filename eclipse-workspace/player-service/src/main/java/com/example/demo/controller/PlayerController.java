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

import com.example.demo.data.Player;
import com.example.demo.dto.PlayerDto;
import com.example.demo.model.PlayerRequestModel;
import com.example.demo.model.PlayerResponseModel;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("/")
public class PlayerController {
	@Autowired
	private PlayerService pService;
	
	@PostMapping("/players")
	public ResponseEntity<PlayerResponseModel> create(@RequestBody PlayerRequestModel playerDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		PlayerDto pDto=mapper.map(playerDetail, PlayerDto.class);
		
		PlayerDto tempDto=pService.createPlayer(pDto);
		PlayerResponseModel model=mapper.map(tempDto, PlayerResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	
	@GetMapping("/view")
	
	public List<ResponseEntity<PlayerResponseModel>> getPlayers(){
		List<Player> list= pService.findPlayers();
		List<ResponseEntity<PlayerResponseModel>> plist=new ArrayList<ResponseEntity<PlayerResponseModel>>();
		ModelMapper mapper= new ModelMapper();
		for(Player p: list) {
			PlayerResponseModel res= mapper.map(p,PlayerResponseModel.class);
			plist.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return plist;
	}
	
	@GetMapping("/view/{id}")
	public Optional<Player> findUser(@PathVariable("id") Long userId){
		
		Optional<Player> player= pService.findById(userId);
		return player;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePlayer(@PathVariable("id") Long id){
	pService.deletePlayer(id);
     }
}
