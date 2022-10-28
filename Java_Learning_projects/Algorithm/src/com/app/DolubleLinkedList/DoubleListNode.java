package com.app.DolubleLinkedList;

public class DoubleListNode {
	
	public Node head;
	public Node tail;
	public int length;
	
	class Node{
		public int data;
		public Node next;
		public Node prevoius;
		public Node(int data) {
			this.data=data;
		}
	}
	public DoubleListNode() {
		head=null;
		tail=null;
		length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public int length() {
		return length;
	}
	
	public void insertLast(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
		}else {
			tail.next=node;
		}
		node.prevoius=tail;
		tail=node;
		length++;
		
	}
	public void displayForward() {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public void displayBackwar() {
		System.out.println("########################");
		while(tail!=null) {
			System.out.println(tail.data);
			tail=tail.prevoius;
		}
	}
	
	public static void main(String[] args) {
		DoubleListNode ob=new DoubleListNode();
		ob.insertLast(10);
		ob.insertLast(20);
		ob.insertLast(30);
		ob.insertLast(40);
		ob.insertLast(50);
		ob.insertLast(10);
		ob.displayForward();
		ob.displayBackwar();
	}
}
