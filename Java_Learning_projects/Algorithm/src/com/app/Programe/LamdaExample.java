package com.app.Programe;

public class LamdaExample {

	public static void main(String[] args) {
		
		Shape s=()->System.out.println("Hiiiiiiiiiiiii");
		passVar(()->System.out.println("Rectange"));
		passVar(s);
		
		Addition add= (int a, int b)-> {return a+b;};
		
		System.out.println(add.add(10, 15));
		
		Addition add2=(a,b)->{
			if(a>10) {
				return 10;
			}else
				return 20;
		};
		System.out.println(add2.add(20, 50));
		
	}
	public static void passVar(Shape k) {
		k.draw();
	}
	
	/*
	 * public static void add(Addition k) { System.out.println(k.add()) }
	 */
}
class A {

	

}
interface Addition{
	public int add(int a,int b);
}

