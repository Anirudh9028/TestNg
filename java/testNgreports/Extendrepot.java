package testNgreports;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendrepot 
{
	/*This 3 veriable or object is mandentery*/
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	/*It will need to execute before start the method*/
	@BeforeTest
	public void startReport() 
	{
		/*name of report  = ExtendReport.html
		 it will generate in current project
		 if you want to change report path the mention pat in 
		 ExtentSparkReporter ...consturter */
		htmlReporter = new ExtentSparkReporter("ExtendReport.html");
		reports = new ExtentReports();
		/*to attach html report*/
		reports.attachReporter(htmlReporter);
		
		/*Set envrioument details*/
		
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "window 10");
		reports.setSystemInfo("Tester", "Anirudh");
		reports.setSystemInfo("Browser", "Chrome");
		
		/*Configuration for report look using... ExtentSparkReporter*/
		htmlReporter.config().setDocumentTitle("Extent report");// set title of report
		htmlReporter.config().setReportName("Test Report"); // project title
		htmlReporter.config().setTheme(Theme.DARK);// set a dark theme
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM, dd, yyyy, hh:mm a '('zzz')'");// set timing format	
			
	}
	
	@Test
	public void LaunchBrowser() 
	{
		// Create test means test info like name etc
		test = reports.createTest("Launch the Browser open url");
		Assert.assertTrue(true);
		
	}
	@Test
	public void verifytitle() 
	{
		// Create test means test info like name etc
		test = reports.createTest("verify title");
		/*test case logic*/
		Assert.assertTrue(false);	
	}
	@Test
	public void verifylogo() 
	{
		// Create test means test info like name etc
		test = reports.createTest("verify logo");
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyemail() 
	{
		// Create test means test info like name etc
		test = reports.createTest("verify email");
		throw new SkipException("Skipping this test case with exception");
	}
	
	@Test
	public void verifyUsername() 
	{
		// Create test means test info like name etc
		test = reports.createTest("verify user name");
		Assert.assertTrue(false);
	}
	
	/*to store execute method result we write this method
	 * and it will must after each method*/
	
	@AfterMethod
	public void getTesteResult(ITestResult result) 
	{
		/*to log info of failure, pass and skip test case in report
		 test.log((Status of method).SKIP, MarkupHelper.createLabel((name of method)result.getName() + (customize msg)"SKIPPED", (with color )ExtentColor.YELLOW));
		  */
		
		if(result .getStatus()== ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAIL", ExtentColor.RED));
			/*to fetch detail info in report*/
			//test.fail(result.getThrowable());
		}
		
		else if(result .getStatus()== ITestResult.SUCCESS) 
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASS", ExtentColor.GREEN));
			//test.pass(result.getThrowable());
		}
		
		else if(result .getStatus()== ITestResult.SKIP) 
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED", ExtentColor.YELLOW));
			//test.skip(result.getThrowable());
		}		
		
	}
	/*To logged msg need to write a msg in report for that
	 * we execute...
	 * and it should be run after every test method
	 * it is mandentetory */
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}
	

}
