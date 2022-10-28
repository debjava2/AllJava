package com.Algo;

public class Quque {

	int top;
	int rear;
	int size;
	int array[];
	
	Quque(){
		this.top=-1;
		this.rear=-1;
		this.size=10;
		this.array=new int[10];
	}
	
	public boolean isFull(){
		return (top==array.length-1);
	}
	public boolean isEmpty() {
		return top==-1 ? true :false;
	}
	
	public void insert(int item) {
		if(!isFull()) {
			top++;
			/*
			 * if(top==0) { rear ++; }
			 */
			
			array[top]=item;
		}
	}
	
	public int pop() {
		top=top-1;
		rear=rear+1;
		return array[rear];
	}
}
