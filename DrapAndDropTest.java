package selenium.Automation_Testing_Website;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DrapAndDropTest extends baseTest{
	
	
	//@Test
	public void draganddrop()
	{
		DragAndDrop DandD=new DragAndDrop(driver);
		DandD.dragdrop();
	}

}
