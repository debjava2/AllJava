package com.app.GeeksForGeeksLinkedList;

import com.app.GeeksForGeeksLinkedList.LinkedList.Node;


public class SearchElement {

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
		System.out.println(list.elementPresent(50));
		System.out.println(list.elementPresent(65));
		//Search Element At Nth node
		
		System.out.println(list.findNthNode(3).data);
		//Serch nth Element From End 
		
		System.out.println(list.findNthNodeFromLast(2).data);
	}
	
}
