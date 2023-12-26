package com.test.logics;

import java.util.Scanner;

public class EMI {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double pri, rate, time, emi;
		System.out.print("Enter the Principal : ");
		pri = input.nextFloat();
		System.out.print("Enter the Rate : ");
		rate = input.nextFloat();
		System.out.print("Enter Time in Year : ");
		time = input.nextFloat();
 
		rate = rate/(12*100);	//one month interest
		time = time*12;		//one month period
		emi = (pri*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
 
		System.out.print("Monthly EMI is : "+emi+"\n");
	
	}

}
