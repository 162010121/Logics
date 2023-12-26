package com.test.logics;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");

		int number = sc.nextInt();
		int pNumber = 1;

		if (number != 1 || number != 2) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					pNumber++;
				}

			}

		}
		if (pNumber > 2 || pNumber == 0) {
			System.out.println("Number Is  Prime Number");
		} else {
			System.out.println("Number Is Not Prime Number");
		}
		sc.close();
	}

}
