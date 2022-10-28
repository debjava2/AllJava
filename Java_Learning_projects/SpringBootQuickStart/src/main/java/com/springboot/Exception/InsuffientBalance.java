package com.springboot.Exception;



public class InsuffientBalance extends RuntimeException {

	public InsuffientBalance(String message) {
		super(message);
	}
}
