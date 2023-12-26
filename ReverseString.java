package com.test.logics;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="Hello World";
		
		  String s1="";
		  
		  	for(int i=s.length()-1;i>=0;i--)
		  	{
		  		s1+=s.charAt(i);
		  		
		  	}
		  	
		  	System.out.println("Original String"+ " "+s);
		  	System.out.println("Reverse String"+ " "+s1);
		
//			StringBuilder builder =new StringBuilder();
//			builder.append(s);
//			builder=builder.reverse();
//			System.out.println(builder);
	}

}
