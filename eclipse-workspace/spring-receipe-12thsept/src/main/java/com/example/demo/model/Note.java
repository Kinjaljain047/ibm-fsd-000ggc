package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Note {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private long id;
private String receipenotes;

@OneToOne
@JoinColumn(name="Receipe_id")
private Receipe receipe;

public Note() {
	super();
}

public Note(long id, String receipenotes, Receipe receipe) {
	super();
	this.id = id;
	this.receipenotes = receipenotes;
	this.receipe = receipe;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getReceipenotes() {
	return receipenotes;
}

public void setReceipenotes(String receipenotes) {
	this.receipenotes = receipenotes;
}

public Receipe getreceipe() {
	return receipe;
}

public void setreceipe(Receipe receipe) {
	this.receipe = receipe;
}

@Override
public String toString() {
	return "Note [id=" + id + ", receipenotes=" + receipenotes + ", receipe=" + receipe + "]";
}





}
