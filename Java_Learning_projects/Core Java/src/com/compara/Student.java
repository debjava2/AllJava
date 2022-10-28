package com.compara;

public class Student {
int id;
String name;
String add;
public Student(int id, String name, String add) {
	this.id = id;
	this.name = name;
	this.add = add;
}
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
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

}
