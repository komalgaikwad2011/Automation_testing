package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class alertBoxTest extends baseTest{
	
	@Test
	public void boxHandle()
	{
		alertBox box=new alertBox(driver);
		box.alertbox();
	}

}
