package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*Object Repositery
 * Find + write the neccessary actions needs to perform
 1. create constructor
 2. locate the Web element
 3. Create the indivisully methods..for each Action on page*/

public class loginPageRepo 
{
	WebDriver driver;
	
	//Constructor
	loginPageRepo(WebDriver d)
	{
		driver = d;
	}

	/* locates the element*/
	By username = By.id ("user-name");
	By password = By.id ("password");
	By loginBtn = By.id ("login-button");
	
	public void enterUsername(String uname) 
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpwd(String pwd) 
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnloginBTN() 
	{
		driver.findElement(loginBtn).click();
	}
	
	
	
}
