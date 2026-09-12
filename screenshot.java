package test.seleniumtesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/shop/women");
		
		File ss=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File saves=new File("F:\\lectures\\teasting\\automation testing\\myntra.png");
		FileHandler.copy(ss, saves);
		
		driver.close();

	}

}
