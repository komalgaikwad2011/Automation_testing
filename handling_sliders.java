package test.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_sliders {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions a=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		a.dragAndDropBy(slider, 50,0).build().perform();
		WebElement slider2=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		a.dragAndDropBy(slider2, 50,0).build().perform();
	}

}
