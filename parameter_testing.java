package test.seleniumtesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_testing {
	
	@Parameters({"num"})
	@Test
	void disp(int a)
	{
		System.out.println("value is :"+a);
	}

}
