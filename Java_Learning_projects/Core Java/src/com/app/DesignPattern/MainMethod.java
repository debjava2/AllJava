package com.app.DesignPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainMethod {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	DateUtilSingleton s1= DateUtilSingleton.getInstance();
	File ab=new File("ob.ser");
	if(ab.exists())
		ab.delete();
	ab.createNewFile();
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(ab));
	out.writeObject(s1);
	ObjectInputStream in=new ObjectInputStream(new FileInputStream(ab));
	DateUtilSingleton s2=(DateUtilSingleton) in.readObject();
	System.out.println(s1==s2);
	
	
}
}
