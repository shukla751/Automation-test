package Com.Base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Com.Utility.ConfigDataprovider;
import Com.Utility.ExcelDataprovider;
import Com.Utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {
	
	public static WebDriver driver;
	public ConfigDataprovider config;
	public ExcelDataprovider excel;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupsuit()
	{
		excel = new ExcelDataprovider();
		config =new ConfigDataprovider();
		
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Flipcart_")+Helper.getCurrentDateTime()+".html");
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",config.getBrowser());
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(config.getURL());
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void teardownmethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.capturescreenshot(driver);
		}
		
		report.flush();
	}

}
