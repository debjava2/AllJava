package com.app.GeeksForGeeksLinkedList;

import com.app.GeeksForGeeksLinkedList.LinkedList.Node;

public class SwapTwoNodes {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.head=new Node(10);
	Node secondNode=new Node(20);
	Node thirdNode=new Node(30);
	Node fourthNode=new Node(40);
	Node fifthNode=new Node(50);
	Node sixthNode=new Node(60);
	Node seventhNode=new Node(70);
	list.head.next=secondNode;
	secondNode.next=thirdNode;
	thirdNode.next=fourthNode;
	fourthNode.next=fifthNode;
	fifthNode.next=sixthNode;
	list.show();
	System.out.println("####################");
	list.SwapNode(30, 60);
	list.show();
	
}
}
