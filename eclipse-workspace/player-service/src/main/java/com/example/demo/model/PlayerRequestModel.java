package com.example.demo.model;

public class PlayerRequestModel {
	 private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private String league;
	    
		

		public PlayerRequestModel() {
			super();
		}
		public PlayerRequestModel(String firstName, String lastName, String email, String password, String league) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
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
