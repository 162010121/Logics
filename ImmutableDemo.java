package com.test.logics;

final class Student
{
	final String name;
	
	public Student(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}
public class ImmutableDemo
{
	public static void main(String[] args) 
	{
		Student s=new Student("Praveen Pustera");
		String str=s.getName();
		System.out.println(str);
		
		
	}
}