package com.test.logics;


@FunctionalInterface
interface Drawable
{
	public void draw();
		
	default String getName()
	{
		return "Praveen";
	}
	default String getTime()
	{
		return "Praveen";
	}
	
	static String get()
	{
		return "Praveen";
	}
	static String set()
	{
		return "Praveen";
	}
}

public class TestLamda
{
	public static void main(String[] args) {
		
		Drawable d2=()->{
			
			//System.out.println("Hi Praveen");
			
		};
		
		
		d2.draw();
		d2.getName();
		
		
	}
}