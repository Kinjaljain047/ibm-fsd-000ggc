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

import com.example.demo.data.Player;
import com.example.demo.dto.PlayerDto;
import com.example.demo.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	private Environment env;
	private PlayerRepository playerRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	public PlayerServiceImpl(Environment env, PlayerRepository playerRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.playerRepository = playerRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}



	@Override
	public PlayerDto createPlayer(PlayerDto playerDetail) {
		// TODO Auto-generated method stub
		playerDetail.setUserId(UUID.randomUUID().toString());
		String bPass=bCryptPasswordEncoder.encode(playerDetail.getPassword());
		playerDetail.setBcrypetedPassword(bCryptPasswordEncoder.encode(playerDetail.getPassword()));
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Player player=mapper.map(playerDetail, Player.class);
		player.setPassword(playerDetail.getBcrypetedPassword());
		playerRepository.save(player);
		PlayerDto pDto=mapper.map(player, PlayerDto.class);
		
		return pDto;
}

	
	@Override
	public List<Player> findPlayers() {
		
		return playerRepository.findAll();
	}

	@Override
	public Optional<Player> findById(Long id) {
		
		return  playerRepository.findById(id);
	}

	@Override
	public void deletePlayer(Long id) {
		Player player= new Player();
		Optional<Player> p= playerRepository.findById(id);
		if(p.isPresent()) {
		 playerRepository.delete(p.get());
		 System.out.println("deleted");
		}else {
			System.out.println("result is not present");
		}
	}
}
