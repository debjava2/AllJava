package com.app.stack;

import com.app.DolubleLinkedList.DoubleLinkList.ListNode;

public class StackClass {
	public static ListNode top;
	private static int length;
 public static void main(String[] args) {
	 StackClass ob=new StackClass();
	 ob.push(10);
	 ob.push(20);
	 ob.push(30);
	 ob.push(40);
		/*
		 * while(top.next!=null) { System.out.println(top.data); top=top.next; }
		 * System.out.println(top.data);
		 */
	 while(length!=0)
	 System.out.println(ob.pop());
	
}
 public void push(int data) {
	 ListNode temp=new ListNode(data);
	 temp.next=top;
	 top=temp;
	 length++;
 }
 
 public int pop() {
	 int data=top.data;
	 top=top.next;
	 length--;
	 return data;
 }
}
