package com.test.logics;

public class Singleton {

	private static Singleton s;

	public String str;

	private Singleton() {
		str = "Example For Singleton";
	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

	public static void main(String[] args) {

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();

		System.out.println("STRING FROM A IS :" + a.str);
		System.out.println("STRING FROM B IS :" + b.str);
		System.out.println("STRING FROM C IS :" + c.str);

	}
}
