package Com.Pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartLoginPage {
	
WebDriver ldriver;
	
	public FlipcartLoginPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement Login;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement EmailId;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;
	
	public void Login() 
	{
		Login.click();
	}
	
	public void setEmail(String Email)
	{
		EmailId.sendKeys(Email);
	}
	
	public void setpassword(String pwd)
	{
	   Password.sendKeys(pwd);
	}
	

}
