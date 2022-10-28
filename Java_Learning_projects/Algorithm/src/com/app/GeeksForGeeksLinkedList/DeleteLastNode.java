package com.app.GeeksForGeeksLinkedList;

import com.app.GeeksForGeeksLinkedList.LinkedList.Node;

public class DeleteLastNode {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.head=new Node(10);
	Node second=new Node(20);
	Node third=new Node(30);
	Node fourth=new Node(40);
	list.head.next=second;
	second.next=third;
	third.next=fourth; 
	list.deleteLastNode();
	list.show();
	//Delete Last Node;
}
}
