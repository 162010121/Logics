package com.test.logics;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
//		int[] num= {1,2,3,4,5,6};
//		int sum=0;
//		//int n=num.length;
//		for(int  i=0;i<num.length;i++)
//		{
//			sum+=num[i];
//			
//			
//		}
//		//int avg=sum/n;	
//		System.out.println("Sum Of Array"+" "+sum);
//		//System.out.println("Average Of Array"+" "+avg);
		
		
		int[] array= {3,2,4,5,6,7,8};
		int sum=0;
		//int n=array.length;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			
		}
		//int avg=sum/n;
		
		//System.out.println("Avg Of Array"+avg);
		System.out.println("Sum Of Array"+sum);
		
		
		
		//Sum oF array Using Java 8
		
		
		int[]  a= {9,0,5,9,8,5,1,3,1,6};
		
		int total=Arrays.stream(a).sum();
		
		System.out.println(total);
	}
}
