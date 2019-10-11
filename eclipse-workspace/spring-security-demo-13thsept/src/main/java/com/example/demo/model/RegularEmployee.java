package com.example.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("regularemployee")
public class RegularEmployee extends Employee {
   private String salary;
   private String commission;
   
   
public RegularEmployee() {
	super();
}


public RegularEmployee(long id, String name, String email, String salary, String commission) {
	super(id, name, email);
	this.salary=salary;
	this.commission=commission;
}

public RegularEmployee( String name, String email, String salary, String commission) {
	super( name, email);
	this.salary=salary;
	this.commission=commission;
}




public String getSalary() {
	return salary;
}


public void setSalary(String salary) {
	this.salary = salary;
}


public String getCommission() {
	return commission;
}


public void setCommission(String commission) {
	this.commission = commission;
}


@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", commission=" + commission + "]";
}
   


   
}
