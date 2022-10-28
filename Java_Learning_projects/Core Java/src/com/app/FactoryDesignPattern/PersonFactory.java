package com.app.FactoryDesignPattern;

public class PersonFactory {

	public static Person person;
	
	public static Person getPesonObject(String type) {
		if(type.equals("Male"))
			person=new Male();
		else if(type.equals("Female"))
		person=new FeMale();
		return person;
	}
}
