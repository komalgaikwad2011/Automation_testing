package test.seleniumtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://youtube.com/");
    }
}

