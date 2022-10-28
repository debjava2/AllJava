package com.app.Recursion;

public class ContiniuosSeqeunce {
public static void main(String[] args) {
	String arr="12359a6784@-5-7-3-2-1";
	int sum=0;
	for(int i=0;i<arr.length();i++) {
		int a=0;
		try {
		 a=Integer.parseInt(""+arr.charAt(i));
		}catch(Exception ex) {
			continue;
		}
		if(sum+1==a) {
			System.out.println("Continue");	
		}
		sum=a;
	}
}
}
