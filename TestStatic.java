 package com.test.logics;

public class TestStatic {
	
		public  void testData()
		{
			System.out.println("Hi Praveen");
		}

}

class Child extends TestStatic
{
	@Override
	public void testData()
	{
		System.out.println("Hi Praveen from child");
	}

	
}
