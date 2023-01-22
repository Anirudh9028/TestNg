package testNgreports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listnersExtentReport implements ITestListener
{

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureExtentReport() 
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportlistner.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		/*Add system info/environment info to reports*/
		
		reports.setSystemInfo("Machine", "test pc 1");
		reports.setSystemInfo("OS", "Window 10");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("QA", "Anirudh");
		
		/*Configuration to change look report*/
		
		htmlReporter.config().setDocumentTitle("Extent Report Using Listners");
		htmlReporter.config().setReportName("listner and Extent Report ex ");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM, dd, yyyy, hh:mm a '('zzz')'");
		
		/*To use this cofigure with listner we need to call them before start
		  execution of test method so... here we assing this configure with in 
		  onStart method (listners method)
		  
		  like wise we use on test,sucess,failed and finish listener 
		  to log status info in report..
		  
		  And At the End we call flush method After completion of all methods
		  so we in on finish method */
		
	}
	
	//This belong to ITestListener and It will Execute Before Starting Of Test set/Batch
	public void onStart(ITestContext Result)
	{
		configureExtentReport();
		System.out.println("Starts Test Execution...." ); 
	}

	//This belongs to ITestListner and it will execute after Starting Of Test set/Batch
	public void onFinish(ITestContext Result) 
	{
		reports.flush();
		System.out.println("Finish Test Execution....");
	}
	
	//This Belongs To ITestListener and will execute  before every the main test start ie. @Test
	public void onTestStart(ITestResult Result) 
	{
		System.out.println("Starts test....."+Result.getName());
	}

	//This Belongs To ITestListener and it will execute when a test is skipped 
	public void onTestSkipped(ITestResult Result) 
	{
		System.out.println("Skipped test: "+Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the Skipped Test Case is: "+ Result.getName(), ExtentColor.YELLOW));
	}
	
	// This belongs to ITlisteners and it will execute when test is passed
	public void onTestSuccess(ITestResult Result) 
	{
		System.out.println("Passed test: "+Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the Failed Test Case is: "+ Result.getName(), ExtentColor.GREEN));
	}
	

	// This belongs to ITlisteners and it will execute when test is failed
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("Failed test: "+Result.getName());
	
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the Failed Test Case is: "+ Result.getName(), ExtentColor.RED));
	}
	
	//Not so Important...
	public void onTestFailureButWithinSuccessPercentage(ITestResult Result) 
	{
		/*This method called bz it wrote in this interface
		 and we know in interface all method are abstract methods
		 So as per java rule we need to call all of them 
		 other wise impletation of interface wont work */
		
		System.out.println("");
	
	}
	
	
	/*Listeners are used with help of inherited method or using XML file both way we can used it
	 In xml we do not need  to call Listeners interface over which file apply*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
