package com.app.Programe;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMain {
public static void main(String[] args) {
	List<Student> st=new ArrayList<>();
	Student s1=new Student(1, 40, "KGP");
	Student s2=new Student(1, 30, "ADP");
	Student s3=new Student(1, 60, "CCP");
	Student s4=new Student(1, 50, "MMG");
	st.add(s1);
	st.add(s2);
	st.add(s3);
	st.add(s4);
	List<Integer> a=st.stream().map(number -> number.marks +10).collect(Collectors.toList());
	System.out.println(a);
	
	 Function<String, Integer> func = x -> x.length();

     Function<Integer, Integer> func2 = x -> x * 2;

     Integer result = func.andThen(func2).apply("mkyong");   // 12

     System.out.println(result);
	
	
}
}
