package test.seleniumtesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class before_after_annotation {
	
	@BeforeTest
	void banana()
	{
		System.out.println("banana test case");
	}
	
	@Test
	void apple()
	{
		System.out.println("apple test case");

	}
	
	@AfterTest
	void orange()
	{
		System.out.println("orange test case");

	}

}
