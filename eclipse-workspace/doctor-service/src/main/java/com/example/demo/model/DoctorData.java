package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class DoctorData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name="doctorname")
private String doctorname;

@Column(name="speciality")
private String speciality;

public DoctorData() {
	super();
}

public DoctorData(Long id, String doctorname, String speciality) {
	super();
	this.id = id;
	this.doctorname = doctorname;
	this.speciality = speciality;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDoctorname() {
	return doctorname;
}

public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}

public String getSpeciality() {
	return speciality;
}

public void setSpeciality(String speciality) {
	this.speciality = speciality;
}



}
