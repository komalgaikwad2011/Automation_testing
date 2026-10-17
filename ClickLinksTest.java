package selenium.Automation_Testing_Website;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickLinksTest extends baseTest{
	
	@Test
	public void link()
	{
		ClickLinks link=new ClickLinks(driver);
		link.linksClick();
				
	}

}
