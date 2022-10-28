package com.app.Programe;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterface {
public static void main(String[] args) {
Function<String, Integer> fmp=(String t)->t.length();

System.out.println(fmp.apply("Debashish"));
//Consumer Function Consumes and does not return anything
Consumer<String> cp=(String t)->System.out.println(t);
cp.accept("Hello World");

Supplier<String> cons=()->"Hello World";

System.out.println(cons.get());

Runnable rr=()->System.out.println("Thread Started");
Thread t=new Thread(rr);
Thread t2=new Thread(rr);
t.start();
t2.start();


}
}

class FuntionImpl implements Function<String, Integer>{
	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return null;
	}
}

