package PriorityAndEnabled;

import org.testng.annotations.*;

public class ex1 
{
	@Test(priority = 1)
	public void TestD() 
	{
		System.out.println("test 4");
	}
	@Test(priority = 2)
	public void TestC() 
	{
		System.out.println("test 3 ");
	}
	
	@Test(priority =4)
	public void TestA() 
	{
		System.out.println("test 1");
	}
	
	@Test(priority = 3, enabled = false)
	public void TestB() 
	{
		System.out.println("test 2");
	}
	

}
