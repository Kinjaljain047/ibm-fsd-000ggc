package com.example.demo.dto;

public class PlayerDto {
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	private String bcrypetedPassword;
	private String password;
	private String league;
	
	
	public PlayerDto() {
		super();
	}

	public PlayerDto(String firstName, String lastName, String email, String userId, String bcrypetedPassword,
			String password, String league) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.bcrypetedPassword = bcrypetedPassword;
		this.password = password;
		this.league = league;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBcrypetedPassword() {
		return bcrypetedPassword;
	}

	public void setBcrypetedPassword(String bcrypetedPassword) {
		this.bcrypetedPassword = bcrypetedPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	
	
	
}
