package com.example.demo.playerclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.PlayerResponseModel;



@FeignClient(name="player-service")
public class PlayerServiceClient {
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public List<ResponseEntity<PlayerResponseModel>> getPlayers();

	 @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	 public Player getPlayer(@PathVariable("id") int id);
	
}
