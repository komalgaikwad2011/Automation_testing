package test.seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertinterface {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		/*//alert interface use for handling alert boxes
		 driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(5000);
		al.accept();
		*/
		
		//confirmation alert
		/*driver.findElement(By.id("confirmBtn")).click();
		Alert al2=driver.switchTo().alert();
		System.out.println(al2.getText());
		Thread.sleep(5000);
		//al2.accept();
		al2.dismiss();
		*/
		
		//prompt alert
		driver.findElement(By.id("promptBtn")).click();
		Alert al3=driver.switchTo().alert();
		System.out.println(al3.getText());
		al3.sendKeys("komal");
		Thread.sleep(5000);
		al3.accept();
		
		
	}

}
