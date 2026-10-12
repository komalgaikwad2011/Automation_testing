package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickAndEnterText {
	
	ChromeDriver driver;
	public DoubleClickAndEnterText(ChromeDriver driver)
	{
		this.driver=driver;
	}

	
	public void doubleClickandEnterText()
	{
		WebElement a=driver.findElement(By.id("field1"));
		a.sendKeys(Keys.CONTROL+"a");
		a.sendKeys("komal");
		driver.findElement(By.id("field2")).sendKeys("gaikwad");;
		
	}
	
}
