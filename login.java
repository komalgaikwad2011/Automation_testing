package selenium_testing.e_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {		
		
	 ChromeDriver driver;
		public login(ChromeDriver driver)
		{
			this.driver=driver;
		}
		
		public void enterUsername(String username)
		{
			driver.findElement(By.id("user-name")).sendKeys(username);
		}
		
		public void enterPassword(String password)
		{
			driver.findElement(By.id("password")).sendKeys(password);
		}
		
		public void clickSubmit()
		{
			driver.findElement(By.id("login-button")).click();
		}
		
		public void loginToApplication(String username,String password) 
		{
			enterUsername(username);
			enterPassword(password);
			clickSubmit();
			
			
		}

}
