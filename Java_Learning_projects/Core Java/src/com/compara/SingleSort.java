package com.compara;

public class SingleSort implements Comparable<Student>{

	@Override
	public int compareTo(Student o) {
		if(o.getName().compareTo(null))
		return 0;
	}

}
