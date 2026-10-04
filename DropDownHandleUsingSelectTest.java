package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class DropDownHandleUsingSelectTest extends baseTest{
	@Test
	public void dropdown()
	{
		DropDownHandleUsingSelect dropDown=new DropDownHandleUsingSelect(driver);
		dropDown.handleDropdown();
	}

}
