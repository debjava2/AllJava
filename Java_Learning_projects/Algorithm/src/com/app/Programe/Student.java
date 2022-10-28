package com.app.Programe;

public class Student {
int id;
int marks;
String address;
public Student(int id, int marks, String address) {
	this.id = id;
	this.marks = marks;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
