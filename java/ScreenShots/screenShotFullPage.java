package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShotFullPage {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		/*Full page ScreenShot
		 *While using WebDriver interface we need to casting
		 *Ex:- WebDriver driver = new ChromeDriver();
		 *Casting:- TakesScreenshot ts = (TakesScreenshot) driver;
		 *
		 *bt when we will use direct any browser driver(chrome, firefox,edge ) there is no need to do type cast
		 *Ex:-ChromeDriver driver =  new ChromeDriver()
		 *Casting:- TakesScreenshot ts =driver;   */
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		//TakesScreenshot ts =driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);// its method take screen shot in a file formatt
		
		File trg = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\firstscreenshot.png");// file to be save = file path + filename+ file extension
	
		FileUtils.copyFile(src,trg);// .copyFile(src,trg)= used for copy to folder
		driver.close();
	
		
		

	}

}
