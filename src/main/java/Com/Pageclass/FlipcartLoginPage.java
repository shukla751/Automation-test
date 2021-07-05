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
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement login;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]")
	WebElement Menu;
	
	@FindBy(xpath="//div[contains(text(),'My Profile')]")
	WebElement Myprofile;
	
	@FindBy(xpath="//span[contains(text(),'Edit')]")
	WebElement Edit;
	
	@FindBy(xpath="//div[contains(text(),'Manage Addresses')]")
	WebElement ManageAdd;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div")
	WebElement Click;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='pincode']")
	WebElement Pincode;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div[2]/input")
	WebElement Locality;
	
	@FindBy(xpath="//textarea[@name='addressLine1']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='landmark']")
	WebElement Landmark;
	
	@FindBy(xpath="//input[@name='alternatePhone']")
	WebElement Altphone;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[7]/div/div/label[1]/div[1]")
	WebElement Home;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logout;
	
		
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
	
	public void Login1() throws InterruptedException
	{
		login.click();
	}
	
	public void Menu() throws InterruptedException
	{
		Thread.sleep(3000);
		Menu.click();
	}

    public void Myprofile() throws InterruptedException
    {
    	Thread.sleep(2000);
    	Myprofile.click();
    	Edit.click();
    	ManageAdd.click();
    	Click.click();
    }
    
    public void Name(String name)
	{
		Name.sendKeys(name);
		phone.sendKeys(name);
	}
    
    public void Pin (String pin)
    {
    	Pincode.sendKeys(pin);
    }
    public void Loc (String name)
    {
    	Locality.sendKeys(name);
    }
    public void Add (String name)
    {
    	Address.sendKeys(name);
    }
    public void Land (String name)
    {
    	Landmark.sendKeys(name);
    }
    public void Altarnatephone (String num)
    {
    	Altphone.sendKeys(num);
    }
    
    public void Home()
    {
    	Home.click();
    	Save.click();
    	logout.click();
    }
    

	

	
	

}
