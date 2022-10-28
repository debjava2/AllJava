package com.Algo.Joe.James;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperation {
public static void main(String[] args) throws IOException {
	Stream<String> bands=Files.lines(Paths.get("C:\\WorkSpace\\Java_Learning_projects\\Core Java\\src\\band.txt"));
	bands.sorted().filter((p)->p.length()>10).forEach((k2)->System.out.println(k2));
	
	
	Stream<String> bands2=Files.lines(Paths.get("C:\\WorkSpace\\Java_Learning_projects\\Core Java\\src\\band.txt"));
	
	List<String> b1=bands2.filter((x)->x.contains("a")).collect(Collectors.toList());
	System.out.println(b1);
	
	Stream<String> bands3=Files.lines(Paths.get("C:\\WorkSpace\\Java_Learning_projects\\"
			+ "Core Java\\src\\band2.txt"));
	
	int  list4=(int) bands3.map((x2)->x2.split(",")).filter((x2)->x2.length>2).count();
	
	System.out.println(list4);
	
	
	/*
	 * Stream<String>
	 * bands4=Files.lines(Paths.get("C:\\WorkSpace\\Java_Learning_projects\\" +
	 * "Core Java\\src\\band2.txt"));
	 * 
	 * bands4.map((l)->l.split(",")).filter((l2)->l2.length==3).
	 * filter((l3)->l3[1]>15).count();
	 */
	
	int a = Stream.of(7,4,5,2,4,6,8).reduce(0,(a1,a2)->a1+a2);
	System.out.println(a);
	
	
	
	
	bands.close();
	bands2.close();
	bands3.close();
}
}
