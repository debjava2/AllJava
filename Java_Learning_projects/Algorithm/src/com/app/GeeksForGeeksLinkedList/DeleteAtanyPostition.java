package com.app.GeeksForGeeksLinkedList;

import com.app.GeeksForGeeksLinkedList.LinkedList.Node;

public class DeleteAtanyPostition {
public static void main(String[] args) {
	int position=2;
	LinkedList list=new LinkedList();
	list.head=new Node(10);
	Node second=new Node(20);
	Node third=new Node(30);
	Node fourth=new Node(40);
	list.head.next=second;
	second.next=third;
	third.next=fourth;
	list.deleteAtPosition(2);
	list.show();
}
}
