package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	ChromeDriver driver;
	
	public DragAndDrop(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void dragdrop()
	{
		WebElement a=driver.findElement(By.id("draggable"));
		WebElement b=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(a, b).perform();
		
	}

}
