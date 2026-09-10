package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyandpaste {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		fname.sendKeys("komal");
		
		//select text
		fname.sendKeys(Keys.CONTROL+"a");
		
		//copy text
		fname.sendKeys(Keys.CONTROL+"c");
		
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"email\"]"));

		//past text
		lname.sendKeys(Keys.CONTROL+"v");
		
	}

}
