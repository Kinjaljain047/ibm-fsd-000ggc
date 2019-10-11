package com.example.demo.patientclient;

public class DoctorData {
  private Long id;
  private String doctorname;
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
