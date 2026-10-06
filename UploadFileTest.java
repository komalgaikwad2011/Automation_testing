package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class UploadFileTest extends baseTest{
	
	@Test
	public void uploadFile()
	{
		UploadFile file=new UploadFile(driver);
		file.uploadSingleFile();
		file.uploadMultipleFile();
	}

}
