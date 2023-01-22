package retryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.*;

/*First we use failed XMLfile to re run the test case
 1. run the XML file 
 2. go to test-out folder 
 Suit_reRun folder and re run testng-failed XML file */

public class RetryDemo1 
{
	@Test
	public void testCase1() 
	{
		Assert.assertTrue(false);
	}

	@Test
	public void testCase2() 
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testCase3() 
	{
		Assert.assertTrue(true);
	}
}
