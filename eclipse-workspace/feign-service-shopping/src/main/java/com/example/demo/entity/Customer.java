package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public class Customer {
	
	
  private Long id;
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   private String address;
   private int contact;
   
   @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
   private Shopping shopping;
  
   @ManyToMany(mappedBy = "customer1")
   private Set<Product> product1=new HashSet<>();

public Customer() {
	super();
}

public Customer(String firstName, String lastName, String email, String password, String address, int contact,
		Shopping shopping, Set<Product> product1) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.address = address;
	this.contact = contact;
	this.shopping = shopping;
	this.product1 = product1;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getContact() {
	return contact;
}

public void setContact(int contact) {
	this.contact = contact;
}

public Shopping getShopping() {
	return shopping;
}

public void setShopping(Shopping shopping) {
	this.shopping = shopping;
}

public Set<Product> getProduct1() {
	return product1;
}

public void setProduct1(Set<Product> product1) {
	this.product1 = product1;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", password=" + password + ", address=" + address + ", contact=" + contact + ", shopping=" + shopping
			+ ", product1=" + product1 + "]";
}

   
   
}
