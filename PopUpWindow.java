package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {
	
	private ChromeDriver driver;
	
	public PopUpWindow(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void pop()
	{
		driver.findElement(By.id("PopUp")).click();
	}
	

}
