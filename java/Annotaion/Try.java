package Annotaion;

import org.testng.annotations.*;

public class Try 
{

	@BeforeTest
	public void beforeTest () 
	{
		System.out.println("Before-Test");
	}
	
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before-Class");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before-Method");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After-Method");
	}
	
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("After-Class");
	}
	
	
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After-Test");
	}
	
	@Test
	public void test () 
	{
		System.out.println("Simple test");
	}
	
	
	@Test 
	public void test2() 
	{
		System.out.println("Simple test2");
		
	}
	
	
	
	
}
