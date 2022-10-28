package com.spring.multiple.datasource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
private int id;
private String name;
private String email;
private String gender;
public User(String name, String email, String gender) {
	this.name = name;
	this.email = email;
	this.gender = gender;
}


}
