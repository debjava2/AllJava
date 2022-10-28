package com.app.Programe;

public interface Shape {

	public void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Implemeting Rectangle");
		
	}
	
}
class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Implemeting Circle");
		
	}
	
}