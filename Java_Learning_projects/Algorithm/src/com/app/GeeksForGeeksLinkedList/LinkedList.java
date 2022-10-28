package com.app.GeeksForGeeksLinkedList;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void deleteFirst() {
		head = head.next;
		/*
		 * Node n=head; while(n!=null) { System.out.println(n.data); n=n.next; }
		 */
	}

	public void deleteLastNode() {
		Node currentNode = head;
		Node previousToCurrent = null;
		while (currentNode.next != null) {
			previousToCurrent = currentNode;
			currentNode = currentNode.next;
		}
		previousToCurrent.next = null;
	}

	public void deleteAtPosition(int position) {
		int count = 1;
		Node prevoius = head;
		while (count < position) {
			prevoius = prevoius.next;
			count++;
		}
		Node current = prevoius.next;
		prevoius.next = current.next;
		current.next = null;

	}

	public void SwapNode(int x, int y) {

		if (x == y)
			return;
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
//        if (currX == null || currY == null)
//            return;
		if (prevX != null)
			prevX.next = currY;
		/*
		 * else head = currY;
		 */
		if (prevY != null)
			prevY.next = currX;
		/*
		 * else head = currX;
		 */
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;

	}

	// Search Element

	public boolean elementPresent(int data) {
		boolean flag = false;

		Node node = head;
		while (node != null) {
			if (node.data == data) {
				flag = true;
				break;
			}
			node = node.next;
		}

		return flag;

	}

	public Node findNthNode(int index) {

		Node node = head;
		int count = 0;
		while (node != null) {
			if (count == index) {
				break;
			}
			count++;
			node = node.next;
		}
		return node;

	}

	public Node findNthNodeFromLast(int index) {

		Node node = head;
		int count = 0;

		while (node != null) {
			node = node.next;
			count++;
		}
		int index2 = count - index;

		Node node2 = head;
		int count2 = 0;
		while (node2 != null && (count2 < index2)) {
			node2 = node2.next;
			count2++;
		}

		return node2;

	}

//Detect Loop 

	public boolean detectloop() {

		Node fastNode = head;
		Node slowNode = head;
		boolean flag = false;
		while (fastNode != null && fastNode.next != null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
			if (fastNode == slowNode) {
				flag = true;
				break;
			}

		}
		return flag;

	}
	

	public void removeDuplicate() {
		Node currentNode = head;

		while (currentNode != null && currentNode.next != null) {
			if (currentNode.data == currentNode.next.data) {
				currentNode.next = currentNode.next.next;
			} else
				currentNode = currentNode.next;
		}

	}
	
	public void insertIntoSortedNode(Node n) {
		Node current=head;
		Node prevoius=null;
		while(current!=null && current.data<n.data) {
			prevoius=current;
			current=current.next;
		}
		
		
		n.next=current;
		prevoius.next=n;
	}

	
	//Find Starting point of the loop
		public Node FindingStaringPointloop() {
			Node fastNode=head;
			Node slowNode=head;
			Node n=null;
			while(fastNode!=null && fastNode.next!=null) {
				fastNode=fastNode.next.next;
				slowNode=slowNode.next;
				if(fastNode==slowNode) {
					n= getStartingPointOfNodeLoop(slowNode);
					break;
				}
			}
		
			return n;
		}
	
		public Node getStartingPointOfNodeLoop(Node slowNode) {
			Node temp=head;
			while(temp!=slowNode) {
				temp=temp.next;
				slowNode=slowNode.next;
			}
			return temp;
		}
	
		
		public Node mergeTwoList(Node a,Node b) {
			Node dummyList=new Node(0);
			Node tail=dummyList;
			while(a!=null && b!=null) {
				if(a.data<b.data) {
					tail.next=a;
					a=a.next;
				}else {
					tail.next=b;
					b=b.next;
				}
				tail=tail.next;
			}
			if(a==null) {
				tail.next=b;
			}else
				tail.next=a;
			return dummyList.next;
		}
		
		
}