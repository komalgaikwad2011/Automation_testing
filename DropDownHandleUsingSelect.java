package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleUsingSelect {
	
	 ChromeDriver driver;
	 
		public DropDownHandleUsingSelect(ChromeDriver driver)
		{
			this.driver=driver;
		}
	public void handleDropdown()
	{
		WebElement a=driver.findElement(By.id("country"));
		Select select=new Select(a);
		select.selectByValue("india");
	}

}
