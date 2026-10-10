package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class MouseOverTest extends baseTest{
	
	@Test
	public void mouseOver()
	{
		MouseOver mouse=new MouseOver(driver);
		mouse.mouseover();
	}

}
