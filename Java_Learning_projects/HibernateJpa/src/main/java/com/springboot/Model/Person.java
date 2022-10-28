package com.springboot.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@EmbeddedId
	private Address address;
	
	private String firstName;
	private float amount;
	
	public Person() {}

	public Person(Address address, String firstName, float amount) {
		this.address = new Address(firstName, amount);
		this.firstName = firstName;
		this.amount = amount;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
