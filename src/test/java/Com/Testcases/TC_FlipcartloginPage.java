package Com.Testcases;

import org.testng.annotations.Test;

import Com.Base.Baseclass;
import Com.Pageclass.FlipcartLoginPage;

public class TC_FlipcartloginPage extends Baseclass {
	
	@Test
	public void logintest() throws InterruptedException
	{
		
		FlipcartLoginPage login=new FlipcartLoginPage(driver);
		
		//login.Login();
		Thread.sleep(4000);
		login.setEmail(excel.getstringData("Sheet1", 1, 0));
		login.setpassword(excel.getstringData("Sheet1", 1, 1)); 
		
		
		
		
	}

}
