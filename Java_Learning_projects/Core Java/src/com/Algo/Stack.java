package com.Algo;

import java.util.Arrays;

public class Stack {
int top;
int size;
int[] arrayList;
public Stack() {
	this.top = -1;
	this.size = 10;
	this.arrayList = new int[10] ;
}

public boolean isFull() {
	return (top==arrayList.length-1);
}

public boolean isEmpty() {
	return (top==-1 ? true :false); 
}

public boolean insert(int item) {
	if(isFull()) {
		return false;
	}
	top++;
	arrayList[top]=item;
	for(int a:arrayList) {
		System.out.println(a);
	}
	return true;
}

public int pop() {
	return arrayList[top--];
}

@Override
public String toString() {
	return "Stack [top=" + top + ", size=" + size + ", arrayList=" + Arrays.toString(arrayList) + "]";
}

}
