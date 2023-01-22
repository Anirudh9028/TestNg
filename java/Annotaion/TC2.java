package Annotaion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* OR use
 import org.testng.annotations.*;*/

public class TC2 
{
//	@BeforeClass
//	/*This will execute before class... but in the mentioned class only*/
//
//	public void beforeclass() 
//	{
//		System.out.println("This will excute before the class");
//	}
//	
//	@AfterClass
//	/*This will execute after class... but in the mentioned class only*/
//	public void afterclass() 
//	{
//		System.out.println("This will excute after the class");
//	}
//	
	
	@BeforeMethod
	/*This will execute Before every test Method which is present in same class*/
	public void beforeMethod() 
	{
		System.out.println("This will execute Before every test Annotation");
	}

	@AfterMethod
	/*This will execute After every test Method which is present in same class*/
	public void afterMethod() 
	{
		System.out.println("This will execute After every test Annotation");
	}
		
	@Test
	public void test3() 
	{
		System.out.println("This is test3 Method");
	}
	
	@Test
	public void test4() 
	{
		System.out.println("This is test4 Method");
	}
	
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("This is After Test");
	}
	
	@BeforeSuite
	public void beforesuite() 
	{
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void aftersuite() 
	{
		System.out.println("This is After Suite");
	}
	
	
}

