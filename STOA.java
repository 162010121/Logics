package com.test.logics;

import java.util.Arrays;

public class STOA {
	public static void main(String[] args) {
		
		
	String[] str= {"1","2","3"};
	int size=str.length;
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
	{
		
		arr[i]=Integer.parseInt(str[i]);
		
	}
			System.out.println(Arrays.toString(arr));
	}

}
