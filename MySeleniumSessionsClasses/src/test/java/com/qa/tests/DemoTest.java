package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	
	@Test
	public void sum()
	{
		int a =10;
		int b=30;
		Assert.assertEquals(40,a+b);
		System.out.println("Hello");
		
	}
	
	
}
