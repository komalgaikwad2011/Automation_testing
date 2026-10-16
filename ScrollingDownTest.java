package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class ScrollingDownTest extends baseTest{
	
	@Test
	public void Scroll()
	{
		ScrollingDown scroll=new ScrollingDown(driver);
		scroll.handleScroll();
				
	}
	

}
