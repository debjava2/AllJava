package com.lamda.Stream.MapAndFlatMap;

import java.util.List;

public class Person {
private int id;
private String name;
private List<String> phoneNumber;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(List<String> phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
}

}
