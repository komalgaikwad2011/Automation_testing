package test.seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);//website loads la time lagto tya mule thodya time wait karaych mg value dili 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.className("password")).sendKeys("admin123");
		Thread.sleep(5000);
		
	}

}
