package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class DoubleClickAndEntertextTest extends baseTest{
	
	
	@Test
	public void doubleClickandEntertext()
	{
		DoubleClickAndEnterText doubleClickAndEntertext=new DoubleClickAndEnterText(driver);
		doubleClickAndEntertext.doubleClickandEnterText();
	}

}
