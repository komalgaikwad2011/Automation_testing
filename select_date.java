package test.seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_date {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.id("datepicker")).sendKeys("10/20/2026");
		driver.findElement(By.id("start-date")).sendKeys("24/04/2026");
		driver.findElement(By.id("end-date")).sendKeys("20/11/2026");
		driver.findElement(By.className("submit-btn")).click();
	}
 
}
