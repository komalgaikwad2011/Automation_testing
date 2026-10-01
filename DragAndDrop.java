package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {
	
	ChromeDriver driver;
	
	public DragAndDrop(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void dragdrop()
	{
		driver.findElement(By.id("name"));
	}

}
