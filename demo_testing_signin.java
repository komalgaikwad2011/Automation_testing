package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo_testing_signin {

	
	@Test
	void login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("komal");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("submit")).click();
	}
	
}
