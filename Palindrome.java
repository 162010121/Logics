package com.test.logics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");

		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println(temp + " " + "Palindrome Number");

		} else {
			System.out.println(temp + "Not A Palindrome Number");
		}

		// For example, 3553, 12321
		
		sc.close();
	}

}
