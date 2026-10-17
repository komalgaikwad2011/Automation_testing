package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinks {
	
	ChromeDriver driver;
	public ClickLinks(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void linksClick()
	{
		driver.findElement(By.id("apple")).click();
	}

}
