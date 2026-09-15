package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("imagesrc")).sendKeys("F:\\lectures\\teasting\\Manual Testing-1.pdf");
		
	}

}
