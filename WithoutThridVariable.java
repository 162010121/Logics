package javaprogramms.logics;

import java.util.Scanner;

public class WithoutThridVariable {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A frist number");
		int num1=sc.nextInt();
		System.out.println("Enter A frist number");
		int num2=sc.nextInt();
		System.out.println("Before Values num1:"+num1+" and num2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

			System.out.println("After Values num1:"+num1+" and num2:"+num2);
		
	}

}
