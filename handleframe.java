package test.seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handleframe {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(a).perform();
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
		b.click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.switchTo().frame(0);
		WebElement c=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		c.sendKeys("komal");
		
		
		
		
		
	}

}
