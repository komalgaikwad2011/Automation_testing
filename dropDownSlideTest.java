package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class dropDownSlideTest extends baseTest{
	
	@Test
	public void dropdown2()
	{
		dropDownSlide dp=new dropDownSlide(driver);
		dp.DropDown();
	}
	

}
