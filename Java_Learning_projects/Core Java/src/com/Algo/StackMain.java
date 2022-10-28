package com.Algo;

public class StackMain {
public static void main(String[] args) {
	Stack st=new Stack();
	if(!st.isFull()) {
		st.insert(10);
		st.insert(110);
	}
	if(!st.isEmpty()) {
		System.out.println(st.pop());
	}
			
}
}
