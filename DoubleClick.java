package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	ChromeDriver driver;
	public DoubleClick(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void DoubleClicks()
	{
		WebElement a=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[7]/div[1]/button"));
		Actions action=new Actions(driver);
		action.doubleClick(a).perform();
	}

}
