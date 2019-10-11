package com.example.demo.dto;

public class LeagueDto {
	private String leaguename;
	private String season;
	private String year;

	public LeagueDto() {
		super();
	}

	public LeagueDto(String leaguename, String season, String year) {
		super();
		this.leaguename = leaguename;
		this.season = season;
		this.year = year;
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

	@Override
	public String toString() {
		return "LeagueDto [leaguename=" + leaguename + ", season=" + season + ", year=" + year + "]";
	}

}
