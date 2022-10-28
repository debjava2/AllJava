package com.app.stack;

public class RemoveOddElementInArray {
public static void main(String[] args) {
	int[] arr= {3,2,4,7,10,6,5};
	
	int[] k=removeOddElement(arr);
	
	for(int i:k) {
		System.out.println(i);
	}
}
public static int[] removeOddElement(int[] arr) {
	int oddCount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0)
			oddCount++;
	}
	int[] arrOdd=new int[oddCount];
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			arrOdd[count]=arr[i];
			count++;
		}
	}
	return arrOdd;
}
}
