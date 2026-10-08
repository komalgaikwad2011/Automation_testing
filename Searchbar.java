package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbar {
	
	ChromeDriver driver;
	public Searchbar(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void serach(String searchitem)
	{
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(searchitem);
		driver.findElement(By.className("wikipedia-search-button")).click();
	}
}
