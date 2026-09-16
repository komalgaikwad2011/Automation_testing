package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demoblze {
	
	ChromeDriver driver;
	@BeforeSuite
	void launch()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
	}
	
	@Test
	void laptop() throws InterruptedException
	{
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(3000);
	}
	
	@Test
	void monitors() throws InterruptedException
	{
		driver.findElement(By.linkText("Monitors")).click();
		Thread.sleep(3000);

	}
}
