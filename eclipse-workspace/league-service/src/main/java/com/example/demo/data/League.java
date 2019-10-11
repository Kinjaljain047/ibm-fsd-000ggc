package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="league")
public class League {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long id;
	  @Column(name="leaguename")
	  private String leaguename;
	  @Column(name="season")
	  private String season;
	  @Column(name="year")
	  private String year;
	  
	  
	  
	public League() {
		super();
	}



	public League(String leaguename, String season, String year) {
		super();
		this.leaguename = leaguename;
		this.season = season;
		this.year = year;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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
		return "League [id=" + id + ", leaguename=" + leaguename + ", season=" + season + ", year=" + year + "]";
	}
	  
	
	  
}
