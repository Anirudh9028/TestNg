package Annotaion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

/* OR use
 import org.testng.annotations.*;*/

public class tc1 
{
	@BeforeTest
	/*This will execute before class... but in the mentioned class only*/

	public void beforetest() 
	{
		System.out.println("This will excute before the test");
	}
	
	@BeforeClass
	/*This will execute before class... but in the mentioned class only*/

	public void beforeclass() 
	{
		System.out.println("This will excute before the class");
	}
	
	@AfterClass
	/*This will execute after class... but in the mentioned class only*/
	public void afterclass() 
	{
		System.out.println("This will excute after the class");
	}
	
	
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
	/*This annotation use to execute the test case*/
	public void test1() 
	{
		System.out.println("This is test1 Method");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("This is test2 Method");
	}
	
}

