package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Ingredient {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 
 private long id;
 private String amount;
 private String description;
 
 @ManyToMany
 @JoinColumn(name="receipe_id")
 private Set<Receipe> receipe = new HashSet<>();


public Ingredient() {
	super();
}




public Ingredient(long id, String amount, String description, Set<Receipe> receipe) {
	super();
	this.id = id;
	this.amount = amount;
	this.description = description;
	this.receipe = receipe;
}




public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}





public Set<Receipe> getReceipe() {
	return receipe;
}




public void setReceipe(Set<Receipe> receipe) {
	this.receipe = receipe;
}




@Override
public String toString() {
	return "Ingredient [id=" + id + ", amount=" + amount + ", description=" + description + ", receipe=" + receipe
			+ "]";
}





 
 
 
}
