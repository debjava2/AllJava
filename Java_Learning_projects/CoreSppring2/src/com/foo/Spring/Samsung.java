package com.foo.Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	Proceersor pro;
	public void modelName() {
		System.out.println("1 GB Smasung");
		pro.bestProceesor();
	}
}
