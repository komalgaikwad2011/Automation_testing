package selenium_testing.e_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class product {
	
	ChromeDriver driver;
	public product(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void addtoCart() 
	{
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();;

	}
	public void clickOnCart()
	{
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}
	public void removeFromCart()
	{
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}

}
