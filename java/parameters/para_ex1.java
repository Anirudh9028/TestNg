package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class para_ex1
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"}) // parameter need to decleare in XML file and pass the key value
	public void setup(String browser,String application) 
	{
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	    }
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}
		
		driver.get(application);
		
	}
	@Test(priority = 1)
	public void logoTest() 
	{
		WebElement logo = driver.findElement(By.xpath("//div[@id = 'divLogo']/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");// true + true = false
		//Assert.assertFalse(logo.isDisplayed(),"Logo displayed on the page");// false + true = true
		
	}
	
	@Test(priority = 2)
	public void homeTitlepage() 
	{
		String actualtitle = driver.getTitle();
		String Exceptedtitle = "OrangeHRM";

		/*if condition fails it will throws msg */
		Assert.assertEquals(Exceptedtitle,actualtitle, "title not mached");
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	

}
