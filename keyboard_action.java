package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard_action {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w=driver.findElement(By.id("ti6dpd"));
		w.sendKeys("selenium tutorial");
		w.sendKeys(Keys.ENTER);
	}

}
