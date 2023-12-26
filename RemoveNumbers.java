package com.test.logics;

public class RemoveNumbers {

	public static void main(String[] args) {

		String str = "Praveen123Kumar";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				result += str.charAt(i);
			}
		}

		System.out.println(result);
	}
}
