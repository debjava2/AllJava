package com.app.DesignPattern;

import java.io.Serializable;

public class DateUtilSingleton implements Serializable,Cloneable {

	private DateUtilSingleton() {
	}
	private static DateUtilSingleton singleton=null;
	public static  DateUtilSingleton getInstance() {
		if(singleton==null) {
			synchronized(DateUtilSingleton.class) {
				if(singleton==null) {
					singleton=new DateUtilSingleton();
				}
			}
		
		}
		return singleton;
	}
	
	
	public Object readResolve() {
		return singleton;
	}
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not Supporrted");
		
	}
	
}
