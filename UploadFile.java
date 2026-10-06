package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	ChromeDriver driver;
	
	public UploadFile(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void uploadSingleFile()
	{
		//driver.findElement(By.id("singleFileInput")).sendKeys("F:\\\\lectures\\\\teasting\\\\Manual Testing-1.pdf");

	}
	public void uploadMultipleFile()
	{
		WebElement upload=driver.findElement(By.id("multipleFilesInput"));
		String s1="F:\\lectures\\teasting\\Manual Testing-1.pdf";
		String s2="F:\\lectures\\teasting\\Manual Testing-2.pdf";
		upload.sendKeys(s1 + "\n" + s2);
	
	}

}
