package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandle {
	
	ChromeDriver driver;
	public SliderHandle(ChromeDriver driver)
	{
		this.driver=driver;
	}

	public void sliderHandle()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(a, 50, 0).build().perform();
		action.dragAndDropBy(b, 10, 0).build().perform();
		
	}
}
