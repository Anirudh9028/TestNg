package ExtendsReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrP6 {
	
	
	public static WebDriver driver;

	// ScreenShot methods 
	
	public static String ScreenShot (String fileName) {
		/*means it do have preview screenshot image on report*/
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg =new File ("./Screenshot/"+ fileName);
		
		try
		{
			FileUtils.copyFile(src, trg);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return trg.getAbsolutePath();
		
		
	}
   public static String ScreenShotbase64Code () {
		/*this method save screen shot in byte-code language
		 * means it don't have preview screenshot image on report
		 * it will view after click on it*/
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		String base64Code = ts.getScreenshotAs(OutputType.BASE64);
		return base64Code;
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		
		ExtentReports extentreport = new ExtentReports();// create object of  Extent report
		
		/*// Parametric constructor of free report format assigned by Extent report, 
		 * in parameter we need to pass file save file path + file name +.html extension*/
		ExtentSparkReporter sparkreport = new ExtentSparkReporter("E:\\eclips pro file\\TestNG\\src\\test\\java\\ExtendsReport\\extent Report\\P6.html");		
		extentreport.attachReporter(sparkreport);// attacted report location to the report format
		
		
		// open chrome brower
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.speedtest.net/");
		
		// call and store ,  screen shot methods
		
		String ScrnShot= ScreenShot("speed test.png");
		String base64Code = ScreenShotbase64Code();
	
		
		/* Attach screenshots to the extent report (P6)
		 *
		 *Screen Shot log at Test level
		 *for that we use
		 *1) .addScreenCaptureFromBase64String(base64Code,"speed test") and ;
		 *2) .addScreenCaptureFromPath(ScrnShot ,"speed test"); 
		 *....Methods are used
		 **/
		
		/*Screenshot base64Code methods
		 * means it don't have preview screenshot image on report at Test level
		 * it will view after click on it
		 */
		extentreport
		.createTest("Screen Shot base64Code Test 1  " , "This is base64Code Screen Shot")
		.log(Status.INFO,"This is a base64Code method With-out Screen shot msg")
		.addScreenCaptureFromBase64String(base64Code);
		
		/*This is a base64Code method With Screen shot msg at Test level
		 * .addScreenCaptureFromBase64String(base64Code,"Screen shot msg");*/
		
		extentreport
		.createTest("Screen Shot base64Code Test 2  " , "This is base64Code Screen Shot ")
		.log(Status.INFO,"This is a base64Code method With Screen shot msg")
		.addScreenCaptureFromBase64String(base64Code,"speed test");
		
		/* This adding multiple screenshot base64Code method with msg at Test level*/
		extentreport
		.createTest("Multiple Screen Shot base64Code Test 2.2  " , "This is base64Code Multiple Screen Shot ")
		.log(Status.INFO,"This is a base64Code method With Multiple Screen shot along with msg")
		.addScreenCaptureFromBase64String(base64Code,"speed test1")
		.addScreenCaptureFromBase64String(base64Code,"speed test2")
		.addScreenCaptureFromBase64String(base64Code,"speed test3");
		
		
		
		/* Screenshot file path methods
		 * means it do have preview screenshot image on report at Test level*/
		
		extentreport
		.createTest(" This is preview Screen Shot Method Test 3 " , "This is preview Screen Shot Method")
		.log(Status.INFO,"This is a preview screen shot method With-out Screen shot msg")
		.addScreenCaptureFromPath(ScrnShot);
		
		/*This is a preview screen-shot method over a report With Screen shot msg at Test level
		 * .addScreenCaptureFromPath(ScrnShotfile path ,"Screen shot image msg");*/
		extentreport
		.createTest(" This is preview Screen Shot Method Test 4 " , "This is preview Screen Shot Method ")
		.log(Status.INFO,"This is a preview screen shot method With Screen shot msg")
		.addScreenCaptureFromPath(ScrnShot ,"speed test");
		
		/* This adding multiple screenshot base64Code method with msg at Test level*/
		extentreport
		.createTest(" This is Multiple preview Screen Shot Method Test 4.2 " , "This is Multiple preview Screen Shot Method ")
		.log(Status.INFO,"This is a Multiple preview screen shot method With Screen shot msg")
		.addScreenCaptureFromPath(ScrnShot ,"speed test1")
		.addScreenCaptureFromPath(ScrnShot ,"speed test2")
		.addScreenCaptureFromPath(ScrnShot ,"speed test3");
		
		
		/*Screen-Shot log at Log(info details) level
		 *1) (MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build()); And
		 *2) (MediaEntityBuilder.createScreenCaptureFromPath(ScrnShot, "ScrnShot With msg").build());
		 *....Methods are used*/
		
		/*Screenshot base64Code methods
		 * means it don't have preview screenshot image on report at log level
		 * it will view after click on it
		 */
		extentreport
		.createTest("Screen Shot base64Code Test 5  " , "This is base64Code Screen Shot at log level ")
		.info("This is a base64Code method With Screen shot msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code,"ScrnShot With msg").build());
	
		
			
		/*means it do have preview screenshot image on report at log level*/
		extentreport
		.createTest(" This is  preview Screen Shot Method Test 6 " , "This is preview Screen Shot Method at log level")
		.log(Status.INFO,"This is a  preview screen shot method With Screen shot msg")
		//.info("This is a  preview screen shot method With Screen shot msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(ScrnShot).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(ScrnShot, "ScrnShot With msg").build());
		
		
		
		
		
		// it will wrap up all extent report method class to report
		extentreport.flush();
		driver.quit();

	}
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
