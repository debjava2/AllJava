package com.Algo;

public class QuqeMain {
public static void main(String[] args) {
	Quque ob=new Quque();
	if(!ob.isFull()) {
		ob.insert(10);
		ob.insert(20);
	}
	if(!ob.isEmpty()) {
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}
	if(!ob.isEmpty()) {
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}
}
}
