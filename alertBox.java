package selenium.Automation_Testing_Website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertBox {
	
	ChromeDriver driver;
	public alertBox(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void alertbox()
	{
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void Confirmedalertbox()
	{
		driver.findElement(By.id("confirmBtn")).click();
		Alert al=driver.switchTo().alert();
		//al.accept();
		al.dismiss();
	}
	public void Promptalertbox()
	{
		driver.findElement(By.id("promptBtn")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("komal");
		al.accept();
	}
	

}
