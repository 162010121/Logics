package com.test.logics;

class MyException extends RuntimeException {

	public String message;
	
	MyException(String message) {
		super(message);
	}
}

class Main {

	public static void main(String[] args) throws Exception {

		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			throw new MyException("Please don't divided by zero");
		}
	}
}