package filedownload;


import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeAndEdgeDriver {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*For chrome browser*/
		//String location = "C:\\Users\\Anirudh\\Desktop\\file Handling";
		//String location = System.getProperty("user.dir")+"\\downloads\\";
		
		
		HashMap<String,Object> ptm = new HashMap<String, Object>();
		
		ptm.put("download.default_directory", System.getProperty("user.dir"));
		
		
		opt.setExperimentalOption("prefs",ptm);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a"));
		
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", button);
		
		
		//Thread.sleep(3000);

		
		
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@id ='google_esf']"));
//		driver.switchTo().frame(iframe);
//		WebElement Ibutton = driver.findElement(By.xpath("//div[@id ='dismiss-button']"));
//  	js.executeScript("arguments[0].click();", Ibutton);
// 	    driver.quit();
		
	
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='aswift_3']"));
		//WebElement iframeChild2 = driver.findElement(By.xpath("//*[@id='ad_iframe']"));
		
//		if(w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe))==null)
//		{System.out.println("Alert not exists");}
//		else {
//			System.out.println("Alert exists");
//			w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
//			driver.switchTo().frame(iframe);
//			WebElement Ibutton = driver.findElement(By.xpath("//div[@id ='dismiss-button']"));
//			js.executeScript("arguments[0].click();", Ibutton);}
		
		
//		List<WebElement>li = driver.findElements(By.xpath("//iframe[contains(@id,'aswift')]"));
//		li.size();
		//int k = driver.switchTo().frame(li);
		
		
		//ins[contains(@class,'adsbygoogle ')]//iframe[@id='aswift_3']
		
		
		
		try {


			if(w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe))==null)
			{System.out.println("Alert not exists");}
			else {
				System.out.println("Alert exists");
				w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
				driver.switchTo().frame(iframe);
				//driver.switchTo().frame(iframeChild2);
				WebElement Ibutton = driver.findElement(By.xpath("//div[@id ='dismiss-button']"));
				js.executeScript("arguments[0].click();", Ibutton);
				}
		
			
		}
		catch(Exception e) 
		{	
			System.out.println(e);
//			w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
//
//			driver.switchTo().frame(iframe);
//			driver.switchTo().frame(iframe2);
//			
			WebElement Ibutton = driver.findElement(By.xpath("//div[@id ='dismiss-button']"));
			Ibutton.click();
			js.executeScript("arguments[0].click();", Ibutton);
		}
		
		
		//finally {driver.quit();}

		
			

	}
	}


