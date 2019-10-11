package com.example.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("contractualemployee")
public class ContractualEmployee extends Employee {
    private String hourly_paid;
    private String contract_period;
    
   
	public ContractualEmployee() {
		super();
	}


	public ContractualEmployee(long id, String name, String email,String hourly_paid, String contract_period) {
		super(id, name, email);
		this.hourly_paid= hourly_paid;
		this.contract_period= contract_period;
	}

	
	public ContractualEmployee( String name, String email,String hourly_paid, String contract_period) {
		super( name, email);
		this.hourly_paid= hourly_paid;
		this.contract_period= contract_period;
	}


	public String getHourly_paid() {
		return hourly_paid;
	}


	public void setHourly_paid(String hourly_paid) {
		this.hourly_paid = hourly_paid;
	}


	public String getContract_period() {
		return contract_period;
	}


	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}


	@Override
	public String toString() {
		return "ContractualEmployee [hourly_paid=" + hourly_paid + ", contract_period=" + contract_period + "]";
	}
    
	
    
}
