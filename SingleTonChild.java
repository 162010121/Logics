package com.test.logics;

public class SingleTonChild {
	
	public static void main(String[] args) {

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();

		
		System.out.println("STRING FROM A IS :" + a.str);
		System.out.println("STRING FROM B IS :" + b.str);
		System.out.println("STRING FROM C IS :" + c.str);

	}

}
