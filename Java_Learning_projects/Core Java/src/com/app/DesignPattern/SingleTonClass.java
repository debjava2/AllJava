package com.app.DesignPattern;

import java.io.Serializable;

public class SingleTonClass implements Serializable {

	private static SingleTonClass ob;
	private SingleTonClass() {}
	
public static SingleTonClass getObject() {
	
	if(ob==null) {
		ob=new SingleTonClass();
	}
	return ob;
}
}
