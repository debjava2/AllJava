package com.app.Programe;

public class RunnaableLamda {
public static void main(String[] args) {
	Runnable runnable= ()-> {
		System.out.println("Hiiiiiiiiiiiii");
			
		};

		Thread t=new Thread(runnable);
		t.start();
	
}
}
