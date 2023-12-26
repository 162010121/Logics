package com.test.logics;

import java.util.Scanner;

public class WithoutThird {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Num1");
		int num1=sc.nextInt();
		System.out.println("Enter A Num2");
		int num2=sc.nextInt();
		
		System.out.println("Before swapping Numbers:"+num1+num2);
		
		num1=num1+num2;  //10 30    10=10+30 = num1= 40
		num2=num1-num2;  // 30=40-30=                10
		num1=num1-num2;  // 40=40-10 ==              30
		
		System.out.println("After swapping Numbares:"+num1+num2);

	    sc.close();

	}

}
