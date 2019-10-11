package com.example.demo.service;

import java.util.List;

import com.example.demo.data.League;
import com.example.demo.dto.LeagueDto;

public interface LeagueService {
	public LeagueDto createLeague(LeagueDto lDto);
	public List<League> findLeague() ;
}
