package com.Algo;

public class NodeMianClass {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.insert(20);
	list.insert(30);
	list.insert(40);
	list.insert(70);
	
	list.addFirst(100);
	list.insertInMiddle(0, 50);
	
	list.show();
	

	
}
}
