package lisenters;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener
{
	//This belong to ITestListener and It will Execute Before Starting Of Test set/Batch
	public void onStart(ITestContext Result)
	{
		System.out.println("Starts Test Execution...." ); 
	}

	//This belongs to ITestListner and it will execute after Starting Of Test set/Batch
	public void onFinish(ITestContext Result) 
	{
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
	}
	
	// This belongs to ITlisteners and it will execute when test is passed
	public void onTestSuccess(ITestResult Result) 
	{
		System.out.println("Passed test: "+Result.getName());
	}
	

	// This belongs to ITlisteners and it will execute when test is failed
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("Failed test: "+Result.getName());
	
	}
	
	//Not so Important...
	public void onTestFailureButWithinSuccessPercentage(ITestResult Result) 
	{
		System.out.println("");
	
	}
	
	
	/*Listeners are used with help of inherited method or using XML file both way we can used it
	 In xml we do not need  to call Listeners interface over which file apply*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
