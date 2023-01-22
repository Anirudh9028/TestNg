package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntraSelenium 

{
	
	
	@Test
	public void myntra () throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
		
		System.out.println(driver.getTitle());
		
		driver.quit();	
		
	}
	@Test
	public void Google () 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("( //h3[@class=\"LC20lb MBeuO DKV0Md\"])[1]")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	


}
