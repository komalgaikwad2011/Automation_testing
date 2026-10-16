package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {
	
	ChromeDriver driver;
	public ScrollingDown(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void handleScroll()
	{
		driver.findElement(By.id("comboBox")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]/div[100]")).click();
	}

}
