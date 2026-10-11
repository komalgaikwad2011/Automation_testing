package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class PopUpWindowTest extends baseTest{
	
	@Test
	public void popUp()
	{
		PopUpWindow popup=new PopUpWindow(driver);
		popup.pop();
	}

}