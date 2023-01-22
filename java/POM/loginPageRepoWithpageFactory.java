package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Using Page Factory

public class loginPageRepoWithpageFactory 
{
	WebDriver driver;
	
	// constructer
	loginPageRepoWithpageFactory (WebDriver d)
	{
		driver = d;
		
		// This Method Will Create Web Elements
		PageFactory.initElements(driver,this);
	}

	// identify or find Element web elements
	
	/*Username
	 driver.findElement(locatore)= insted of that we use @FindBy(id="user-name")
	 And for declearing webElement object we use WebElement obj-name; */
	
	@FindBy(id="user-name") WebElement username;
	
	// pwd 
	
	@FindBy(id = "password") WebElement password;
	
	//login btn
	@FindBy (id = "login-button") WebElement loginBTN;
	
	
	public void enterUsername(String uname) 
	{
		username.sendKeys(uname);
	}
	
	public void enterpwd(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnloginBTN() 
	{
		loginBTN.click();
	}
	
}
