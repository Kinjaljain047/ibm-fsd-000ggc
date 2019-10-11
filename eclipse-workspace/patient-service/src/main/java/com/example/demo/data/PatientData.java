package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class PatientData {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
@Column(name="name")
private String name;
@Column(name="disease")
private String disease;


public PatientData(Long id, String name, String disease) {
	super();
	this.id = id;
	this.name = name;
	this.disease = disease;
}


public PatientData() {
	super();
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDisease() {
	return disease;
}


public void setDisease(String disease) {
	this.disease = disease;
}



}
