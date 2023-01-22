package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShotSectionOrWebelement {

	public static void main(String[] args) throws IOException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disiable-notification");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://prepinsta.com/top-100-codes/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	
		
		WebElement ele = driver.findElement(By.xpath("//img[@class = 'site-logo img-responsive lazyloaded']"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);// its method take screen shot in a file formatt
		
		File trg = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\firstscreenshot.png");// file to be save = file path + filename+ file extension
	
		FileUtils.copyFile(src,trg);// .copyFile(src,trg)= used for copy to folder
		driver.close();
	
		
		

	}

}
