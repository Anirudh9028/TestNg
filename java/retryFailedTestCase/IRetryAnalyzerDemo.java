package retryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.*;

/*First we need to create different class 
 * to implement IretryAnalyzer interface with his starting and max limit methods
 * Add (Override)retry failed method 
 * and then this class called in @Test Annotation Signature....Where test case get's failed after run
 * in @Test Annotation Signature we use Attribute (retryAnalyzer) =  IRetryAnalyzer implements class name + .class keyword
 * here we need to manual add retry class*/

public class IRetryAnalyzerDemo 
{
	@Test(retryAnalyzer = IretryAnalyzer.class)
	public void testCase1() 
	{
		Assert.assertTrue(false);
	}

	@Test
	public void testCase2() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer = IretryAnalyzer.class)
	public void testCase3() 
	{
		Assert.assertTrue(true);
	}
}
