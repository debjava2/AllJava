package com.app.FactoryDesignPattern;

public class MainClass {
public static void main(String[] args) {
	Person p=PersonFactory.getPesonObject("Female");
p.dressCode();
}
}
