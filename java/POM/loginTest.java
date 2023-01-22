package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	public static void main(String[] args) 
	{
		//loginTest.withoutPageFactory();
		
		loginTest.withPageFactory();

	}
	
	public static void withoutPageFactory() 
	{
		// Lunch Chrome Browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Create  login page (repo)  object 

		loginPageRepo loginpg = new loginPageRepo(driver);

		// open the URL
		driver.get("https://www.saucedemo.com/");

		// call repo method and and enter a data
		loginpg.enterUsername("standard_user");
		loginpg.enterpwd("secret_sauce");
		loginpg.clickOnloginBTN();
		
		driver.quit();
		
		
	}
	
	
	public static void withPageFactory() 
	{
		
		// Lunch Chrome Browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Create  login page (repo)  object 

		loginPageRepoWithpageFactory  loginpgFac = new loginPageRepoWithpageFactory (driver);

		// open the URL
		driver.get("https://www.saucedemo.com/");

		// call repo method and and enter a data
		loginpgFac.enterUsername("standard_user");
		loginpgFac.enterpwd("secret_sauce");
		loginpgFac.clickOnloginBTN();

		
		driver.quit();		
	}

}
