package test.seleniumtesting;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1)
	void z()
	{
		System.out.println("fortune");
	}
	@Test(priority=0)
	void r()
	{
		System.out.println("cloud");

	}
	@Test(priority=2)
	void s()
	{
		System.out.println("technology");
	}
}
