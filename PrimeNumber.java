package javaprogramms.logics;

import java.util.Scanner;

public class PrimeNumber {
	
	
			
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();
		int count=num;
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
					
				}
				if(count==2)
				{
					System.out.println("Prme Number");
					
				}
				else
					
				{
					System.out.println("Not A prime number");
				}
			}
			
		}
		
	}

}
