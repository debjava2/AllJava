package com.app.GeeksForGeeksLinkedList;

import com.app.GeeksForGeeksLinkedList.LinkedList.Node;

public class MergeTwoNodes {
public static void main(String[] args) {
	LinkedList list1=new LinkedList();
	
	//list1.head=new Node(1);
	Node first=new Node(1);
	Node second1=new Node(4);
	Node third1=new Node(8);
	first.next=second1;
	second1.next=third1;

	Node first2=new Node(3);
	Node second2=new Node(6);
	first2.next=second2;
	Node finalNode = list1.mergeTwoList(first, first2);
	while(finalNode!=null) {
		System.out.println(finalNode.data);
		finalNode=finalNode.next;
	}
	
}
}
