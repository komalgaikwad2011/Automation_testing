package selenium.Automation_Testing_Website;

import org.testng.annotations.Test;

public class searchbarTest extends baseTest{
	
	@Test
	public void searchsomthing()
	{
		Searchbar search1=new Searchbar(driver);
		search1.serach("abc");
	}

}
