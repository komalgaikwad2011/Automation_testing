package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FillFormTest extends baseTest{
	
	
	@Test
	public void Validfromfill()
	{
		FillForm fillForm =new FillForm(driver);
		
		fillForm.fullFormFillAndSubmit("komal","komal@gmail.com",1234567890L,"Ahilyanager");
		Assert.assertTrue("form not fill successfully", true);
	}
	//@Test
	public void Invalidfromfill()
	{
		FillForm fillForm =new FillForm(driver);
		
		fillForm.fullFormFillAndSubmit("123","komal",123450L,"123");
		Assert.assertTrue("form fill successfully", false);
	}

}
