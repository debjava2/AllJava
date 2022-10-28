package com.lamda.Perdicate;

import java.util.function.Predicate;

public class Predicate2 {
public static void main(String[] args) {
	/*Predicate<Integer> prediacte=new Predicate<Integer>() {
		
		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return false;
		}
	};*/
	
	Predicate<Integer> prediacte=(t)->{
		if(t>10) {
			return true;
		}else
			return false;
	};
	
	System.out.println(prediacte.test(11));
}
}
