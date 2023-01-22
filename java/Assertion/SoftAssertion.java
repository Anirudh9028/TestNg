package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

/*SoftAssert class belong from SOFT Assertion and it is Case Sensitive
 And Need to Create OBJ of that class
 SOFT Assertion will allow to execute next line code after found exception 
 it will possess all the assert class method
 */

public class SoftAssertion 

{
	WebDriver driver;
	
	@Test
	public void lunchApp () 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		/*create SOFT Assertion object*/
		
		SoftAssert SoftAssert = new SoftAssert();
		
		/*Title assertion*/
		
		String ExceptedTitle = "Facebook – log in or sign up";
		String  actualTitle = driver.getTitle();
		SoftAssert.assertEquals(ExceptedTitle,actualTitle, "title not mached");
		
		
		/*URL Assertion*/
		String actualurl = "https://www.facebooke.com/";
		String ExceptedUrl = driver.getCurrentUrl();
		SoftAssert.assertEquals(actualurl,ExceptedUrl, "URL not mached");
		
		
		/* Text Assertion*/
		String actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getAttribute("alt");
		String ExceptedText = "Facebook";
		SoftAssert.assertEquals(actualText, ExceptedText, "Page Text not mached");
		
		driver.quit();
		SoftAssert.assertAll(); // collect All Exception in obj and displayed at the end if any...!
		
	}
	
	
	
}
