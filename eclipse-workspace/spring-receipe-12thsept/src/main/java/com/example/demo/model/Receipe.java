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
public class Receipe {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private long id;
private String cooktime;
private String description;
private String difficulty;
private String direction;
private String preptime;
private String servings;
private String url;

@OneToOne(mappedBy = "receipe")
private Note note;


@ManyToMany(mappedBy = "receipe")
private Set<Ingredient> ingredient  = new HashSet<>();


public Receipe() {
	super();
}



public Receipe(long id, String cooktime, String description, String difficulty, String direction, String preptime,
		String servings, String url, Note note, Set<Ingredient> ingredient) {
	super();
	this.id = id;
	this.cooktime = cooktime;
	this.description = description;
	this.difficulty = difficulty;
	this.direction = direction;
	this.preptime = preptime;
	this.servings = servings;
	this.url = url;
	this.note = note;
	this.ingredient = ingredient;
}



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCooktime() {
	return cooktime;
}

public void setCooktime(String cooktime) {
	this.cooktime = cooktime;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDifficulty() {
	return difficulty;
}

public void setDifficulty(String difficulty) {
	this.difficulty = difficulty;
}

public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
}

public String getPreptime() {
	return preptime;
}

public void setPreptime(String preptime) {
	this.preptime = preptime;
}

public String getServings() {
	return servings;
}

public void setServings(String servings) {
	this.servings = servings;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public Note getNote() {
	return note;
}



public void setNote(Note note) {
	this.note = note;
}



public Set<Ingredient> getIngredient() {
	return ingredient;
}



public void setIngredient(Set<Ingredient> ingredient) {
	this.ingredient = ingredient;
}



@Override
public String toString() {
	return "Receipe [id=" + id + ", cooktime=" + cooktime + ", description=" + description + ", difficulty="
			+ difficulty + ", direction=" + direction + ", preptime=" + preptime + ", servings=" + servings + ", url="
			+ url + ", note=" + note + ", ingredient=" + ingredient + "]";
}







}
