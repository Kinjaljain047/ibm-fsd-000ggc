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
@Table(name="player")
public class Player {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  
  private long id;
  @Column(name="first_Name")
  private String firstName;
  @Column(name="last_Name")
  private String lastName;
  @Column(name="email")
  private String email;
  @Column(name="password")
  private String password;
  @Column(name="player_id")
  private String userId;
  @Column(name="league")
  private String league;
  
 
public Player() {
	super();
}
public Player(long id, String firstName, String lastName, String email, String password, String userId,String league) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.userId = userId;
	this.league=league;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getLeague() {
	return league;
}
public void setLeague(String league) {
	this.league = league;
}


}
  
