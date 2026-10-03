package selenium.Automation_Testing_Website;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseTest {
	
	ChromeDriver driver;
	@BeforeMethod
	public void openWeb()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

}
