package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class DoubleClickTest extends baseTest{
	
	@Test
	public void doubleclick()
	{
		DoubleClick doubleClick=new DoubleClick(driver);
		doubleClick.DoubleClicks();
				
	}

}
