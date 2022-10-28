package com.springboot.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

//@Embeddable 
//if we remove this annotation then we have to put another anotaion @EmbeddedId
// on the Class which is using it i.e Person.java
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer titleHash;
	
	private Float price;
	
	public Address() {}

	public Address(String title, Float price) {
		this.titleHash = Objects.hash(title);
		this.price = price;
	}

	public Integer getTitleHash() {
		return titleHash;
	}

	public void setTitleHash(Integer titleHash) {
		this.titleHash = titleHash;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((titleHash == null) ? 0 : titleHash.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (titleHash == null) {
			if (other.titleHash != null)
				return false;
		} else if (!titleHash.equals(other.titleHash))
			return false;
		return true;
	}
	

}
