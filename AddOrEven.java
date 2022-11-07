package javaprogramms.logics;

import java.util.Scanner;

public class AddOrEven {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+"is evennumber");
			
		}else
		{
			System.out.println(num+"is addnumber");
		}
		
	}

}
