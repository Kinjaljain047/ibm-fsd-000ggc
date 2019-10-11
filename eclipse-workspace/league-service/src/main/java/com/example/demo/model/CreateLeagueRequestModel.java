package com.example.demo.model;

public class CreateLeagueRequestModel {

	private String leaguename;
	  private String season;
	  private String year;
	public CreateLeagueRequestModel(String leaguename, String season, String year) {
		super();
		this.leaguename = leaguename;
		this.season = season;
		this.year = year;
	}
	public CreateLeagueRequestModel() {
		super();
	}
	public String getLeaguename() {
		return leaguename;
	}
	public void setLeaguename(String leaguename) {
		this.leaguename = leaguename;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	  
	  
}
