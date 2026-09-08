package test.seleniumtesting;


import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://youtube.com/");
		String expected_url="https://youtube.com/";
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equals(actual_url))
		{
			System.out.println("same url");
		}
		else
		{
			System.out.println("different url");

		}
		
		driver.quit();
	}

}
