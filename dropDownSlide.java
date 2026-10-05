package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSlide {
	
	ChromeDriver driver;
	 
	public dropDownSlide(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void DropDown()
	{
		WebElement a=driver.findElement(By.id("colors"));
		Select s=new Select(a);
		s.selectByValue("red");
	}

}
