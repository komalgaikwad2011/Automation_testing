package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {
	
	 ChromeDriver driver;
	 
	public FillForm(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void entername(String username)
	{
		driver.findElement(By.id("name")).sendKeys(username);
	}
	public void enterEmail(String email)
	{
		driver.findElement(By.id("email")).sendKeys(email);
	}
	public void enterno(Long no)
	{
		driver.findElement(By.id("phone")).sendKeys(String.valueOf(no));
	}
	public void enterAddress(String addr)
	{
		driver.findElement(By.id("textarea")).sendKeys(addr);
	}
	public void clickbutton()
	{
		driver.findElement(By.id("female")).click();
	}
	public void clickcheckbox()
	{
		driver.findElement(By.id("sunday")).click();
	}
	
	public void fullFormFillAndSubmit(String username,String email,Long no,String addr)
	{
		entername(username);
		enterEmail(email);
		enterno(no);
		enterAddress(addr);
		clickbutton();
		clickcheckbox();
	}
}
