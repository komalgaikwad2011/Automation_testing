package selenium.Automation_Testing_Website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertBox {
	
	ChromeDriver driver;
	public alertBox(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void alertbox()
	{
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}

}
