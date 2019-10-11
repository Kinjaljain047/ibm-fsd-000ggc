package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.data.League;
import com.example.demo.dto.LeagueDto;
import com.example.demo.repository.LeagueRepository;

@Service
public class LeagueServiceImpl implements LeagueService{
    private LeagueRepository leagueRepository;
    private Environment env;
  
	@Autowired
	public LeagueServiceImpl(LeagueRepository leagueRepository, Environment env) {
		super();
		this.leagueRepository = leagueRepository;
		this.env = env;
	}


	

	@Override
	public LeagueDto createLeague(LeagueDto lDto) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		System.out.println(lDto.toString());
		League league=mapper.map(lDto, League.class);
		System.out.println("kinjal  = "+league.toString());
		leagueRepository.save(league);
		LeagueDto leagueDto=mapper.map(league, LeagueDto.class);
		
		return leagueDto;
	}

	@Override
	public List<League> findLeague() {
		return leagueRepository.findAll();
	}

}
