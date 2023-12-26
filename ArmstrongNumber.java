package com.test.logics;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = sc.nextInt();
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;

		}
		if (sum == temp) {

			System.out.println(sum + " " + "Number Is Armstrong Number");

		} else {
			System.out.println(sum + " " + "Number Is Not Armstrong Number");
		}

		// For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an
		
		sc.close();
	}

}
