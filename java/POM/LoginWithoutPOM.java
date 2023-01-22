package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*With out page object model */

public class LoginWithoutPOM {

	public static void main(String[] args)
	{
		// Lunch Chrome Browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// open the URL
		driver.get("https://www.saucedemo.com/");
		
		
		//find and enter username 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//find and enter username 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		// find and login btn click
		driver.findElement(By.id("login-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
