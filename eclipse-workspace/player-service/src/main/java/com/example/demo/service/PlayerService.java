package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.data.Player;
import com.example.demo.dto.PlayerDto;



public interface PlayerService {
	public PlayerDto createPlayer(PlayerDto playerDetail);
	public List<Player> findPlayers() ;
	Optional<Player> findById(Long id);
	public void deletePlayer(Long id);
	
}
