package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickar {
	
	ChromeDriver driver;
	
	public DatePickar(ChromeDriver driver)
	{
		this.driver=driver;
	}

	public void datePick()
	{
		//driver.findElement(By.id("datepicker")).sendKeys("20/11/2026");
		//driver.findElement(By.id("txtDate")).sendKeys("10/11/2026");
		driver.findElement(By.id("start-date")).sendKeys("12/11/2026");
		driver.findElement(By.id("end-date")).sendKeys("13/11/2026");
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();



	}
	
}
