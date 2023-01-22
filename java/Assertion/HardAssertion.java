package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/*Assert class belong from HARD Assertion and it is Case Sensitive
 Assertion will not allow to execute next line code after found exception, 
 instantly terminate this method logic and move to the next method 
*/

public class HardAssertion 

{
	WebDriver driver;
	
	@Test
	public void lunchApp () 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		/*Title assertion*/
		
		String ExceptedTitle = "Facebook – log in or sign up";
		String  actualTitle = driver.getTitle();
		Assert.assertEquals(ExceptedTitle,actualTitle, "title not mached");
		
		
		/*URL Assertion*/
		String actualurl = "https://www.facebook.com/";
		String ExceptedUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,ExceptedUrl, "URL not mached");
		
		
		/* Text Assertion*/
		String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getAttribute("alt");
		String ExceptedText = "Facebook";
		Assert.assertEquals(actualText, ExceptedText, "Page Text not mached");
		
		
		
		driver.quit();
		
	}
	
	
	
	
}
