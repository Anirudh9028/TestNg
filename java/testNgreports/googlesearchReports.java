package testNgreports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesearchReports 
{
	@Test
	public void gSearch() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser opened....");
		
		
		driver.get("http://www.google.com");
		Reporter.log("Google web site launch....");
		
		driver.findElement(By.name("q")).sendKeys("india gate",Keys.ENTER);
		Reporter.log("In Google Search box type india gate and press enterKey ....");
	
		Reporter.log("Driver close....");
		driver.quit();
	
	
	
		
		
	}
	
	

	
}
