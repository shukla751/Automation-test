package Com.Testcases;

import org.testng.annotations.Test;

import Com.Base.Baseclass;
import Com.Pageclass.FlipcartLoginPage;

public class TC_FlipcartloginPage extends Baseclass {
	
	@Test
	public void logintest() throws InterruptedException
	{
		
		logger=report.createTest("Login to Flipkart");
		FlipcartLoginPage login=new FlipcartLoginPage(driver);
		logger.info("Starting Application");
	
		//login.Login();
		Thread.sleep(4000);
		login.setEmail(excel.getstringData("Sheet1", 1, 0));
		login.setpassword(excel.getstringData("Sheet1", 1, 1)); 
		
		login.Login1();
		
		//login.setEmail(excel.getstringData("Sheet1", 0, 0));
		login.Menu();
		login.Menu();
		login.Myprofile();
		login.Name(excel.getstringData("Sheet1", 2, 0));
		login.Name(excel.getstringData("Sheet1", 2, 1));
		login.Pin(excel.getstringData("Sheet1", 3, 0));
		login.Loc(excel.getstringData("Sheet1", 3, 1));
		login.Add(excel.getstringData("Sheet1", 4, 0));
		login.Land(excel.getstringData("Sheet1", 4, 1));
		login.Altarnatephone(excel.getstringData("Sheet1", 5, 0));
		login.Home();
		
		
		
		
		
		
		
		
		
		
	}

}
