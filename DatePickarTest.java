package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class DatePickarTest extends baseTest{
	@Test
	public void DatePick()
	{
		DatePickar date=new DatePickar(driver);
		date.datePick();
				
	}

}
