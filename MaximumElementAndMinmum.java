package com.test.logics;

import java.util.Arrays;
import java.util.List;

public class MaximumElementAndMinmum {
	public static void main(String[] args) {

		List<Double> list = Arrays.asList(90000.00, 543600.00, 706654.00, 326543.00, 76543.00);
		Double var = list.stream().min(Double::compare).get();

		System.out.print("The min value is : "+var);
		
		
		//Minimum Element
//		int[] a= {10,7,9,5,67};
//		int min=a[0];
//		int n=a.length;
//		for(int i:a)
//		{
//			if(i<min) {
//				min=i;
//			}
//			
//		}
//		System.out.println("The Maximum element in The Array"+min);
		
		
		//Maximum Element
//		int[] a= {10,7,9,5,67};
//		int max=a[0];
//		int n=a.length;
//		for(int i:a)
//		{
//			if(i>max) {
//				max=i;
//			}
//			
//		}
//		System.out.println("The Maximum element in The Array"+max);
	}

}
