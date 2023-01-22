package paraller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallerEx2 
{
	@Test
	public void login() 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
		
		WebElement elm = driver.findElement(By.xpath("//a[@id = 'welcome']"));//isDisplayed();
		
		//System.out.println(text.getText());
		System.out.println("login is sucessful and welcome text shows on web page: "+elm.isDisplayed());
		 driver.quit();
		
		
	}
	
	
	
	
	
	
	
	

}
