package selenium_testing.e_commerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
