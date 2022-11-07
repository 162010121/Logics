package javaprogramms.logics;

import java.util.Arrays;

public class StringToArray {
	
	public static void main(String[] args) {
		
			
	String s[]= {"10","29"};
	int size=s.length;
	int [] arr=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=Integer.parseInt(s[i]);
	}
		System.out.println(Arrays.toString(arr));
	}
}
