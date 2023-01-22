package invocationCount;

import org.testng.annotations.*;

/*Invocation Count Attribute is Used To run single test case multiple time
 Syntax =  @Test(invocationCount = num )
 num = number of times u want to run this method
 jst like a for loop
 execute reguler way or using XML file 
 
 If we decleared ..invocationCount = 0,...then test wont run*/

public class invocationDemo 
{
	@Test(invocationCount = 3)
	public void testMethod1() 
	{
		System.out.println("Test method1....");
	}
	
	@Test(invocationCount = 2)
	public void testMethod2() 
	{
		System.out.println("Test method2....");
	}

}
