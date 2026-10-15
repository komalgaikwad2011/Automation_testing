package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class SliderHandleTest extends baseTest{
	
	@Test
	public void slider()
	{
		SliderHandle sliders=new SliderHandle(driver);
		sliders.sliderHandle();
	
	}

}
