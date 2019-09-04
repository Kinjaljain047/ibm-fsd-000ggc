package com.ibm.fsd.my_first_maven_demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employeee")
public class Employee implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	@Column(name="firstname")
   private String firstname;
	@Column(name="lastname")
   private String lastname;
	@Column(name="email")
   private String email;
public Employee() {
	super();
}
public Employee( String firstname, String lastname, String email) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}
   
   
}
