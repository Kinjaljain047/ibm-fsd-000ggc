package com.example.demo.patientclient;

public class PatientData {
    private Long id;
    private String name;
    private String disease;
    
    
	public PatientData() {
		super();
	}


	public PatientData(Long id, String name, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.disease = disease;
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
