package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	ChromeDriver driver;
	public MouseOver(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void mouseover()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions action=new Actions(driver);
		action.moveToElement(a).perform();
	}

}
