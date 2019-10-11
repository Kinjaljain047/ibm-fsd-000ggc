package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.League;
import com.example.demo.dto.LeagueDto;
import com.example.demo.model.CreateLeagueRequestModel;
import com.example.demo.model.CreateLeagueResponseModel;
import com.example.demo.service.LeagueService;

@RestController
@RequestMapping("/")
public class LeagueController {
	
   private LeagueService leagueService;
   
	private Environment env;
   
	
	
	
	public LeagueController(LeagueService leagueService, Environment env) {
		super();
		this.leagueService = leagueService;
		this.env = env;
	}

	@PostMapping("/leagues")
	public ResponseEntity<CreateLeagueResponseModel> create(@RequestBody CreateLeagueRequestModel ldto)
	{
	   ModelMapper mapper = new ModelMapper();
	   mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	   LeagueDto uDto=mapper.map(ldto,LeagueDto.class);
	   	System.out.println(uDto.toString());
		LeagueDto tempDto=leagueService.createLeague(uDto);
		CreateLeagueResponseModel model=mapper.map(tempDto,CreateLeagueResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
   
   @GetMapping("/viewLeague")
   public List<League> findLeague(){
	  return  leagueService.findLeague();
   }
}
