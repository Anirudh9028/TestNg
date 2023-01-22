package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM 

{
	
	WebDriver driver;
	
	@Test
	public void lunchApp () 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://opensource-demo.orangehrmlive.com/");	
	}
	
	@Test
	public void enterloginDetails() 
	{
		driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin123");	
		driver.findElement(By.xpath("//input[@value = 'LOGIN']")).click();		
	}
	@Test
	public void myInfo() 
	{
		
		driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
	}
	
	@Test
	public void myInfoVerify() 
	{
		
		WebElement elem = driver.findElement(By.xpath("//div[@id='pdMainContainer']"));//verify my info
		System.out.println("is My Info displayed"+elem.isDisplayed());
		driver.quit();
		
		
	}
	@Test
	public void loginVerify() 
	{
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='MP_link']"));
		System.out.println("is login Succssefull" + ele.isDisplayed());
		//driver.quit();		
	}
	//driver.quit();
	
	
	
	
	
	
}
