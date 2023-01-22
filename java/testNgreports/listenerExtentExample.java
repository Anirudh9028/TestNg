package testNgreports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listenerExtentExample 
{

	@Test
	public void LaunchBrowser() 
	{
		Assert.assertTrue(true);
		
	}
	@Test
	public void verifytitle() 
	{
		
		/*test case logic*/
		Assert.assertTrue(false);	
	}
	@Test
	public void verifylogo() 
	{
	
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyemail() 
	{
		
		throw new SkipException("Skipping this test case with exception");
	}
	
	@Test
	public void verifyUsername() 
	{
		
		Assert.assertTrue(false);
	}
}
