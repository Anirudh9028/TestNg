package paraller;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

/*paraller method */
public class parallerEx1 
{ 
	WebDriver driver;
	@BeforeClass
	public void setUp() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	@Test
	public void logoTest() 
	{
		
		WebElement logo = driver.findElement(By.xpath("//div[@id = 'divLogo']/img"));
		System.out.println("orangeHRM logo present on this page: "+logo.isDisplayed());
		
	}
	@Test
	public void homePageTitle() 
	{
		
		String exceptedtitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
	
		Assert.assertEquals(actualTitle, exceptedtitle);
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	

}
