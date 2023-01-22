package retryFailedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzer implements IRetryAnalyzer
{
	/*counter to keep track of retry attempts*/
	int CounterForRetryAttempts = 0;
	
	/*Set max limit for retry*/
	int SetMaxLimitForRetry = 2;

	/*Method to retry failed test case*/
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(!result.isSuccess())
		{
			if(CounterForRetryAttempts<SetMaxLimitForRetry) 
			{
				CounterForRetryAttempts++;
				return true;
			}
		}
		
		
		return false;
	}
	
	
	

}
