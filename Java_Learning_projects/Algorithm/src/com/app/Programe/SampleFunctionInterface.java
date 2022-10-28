package com.app.Programe;

@FunctionalInterface
public interface SampleFunctionInterface {

	public void call();
	
	default void callMetoo() {
		System.out.println("Hiiiiiiiiiiiii");
	}
	public static void callMe3() {
		
	}
}

