package Grouping;

import org.testng.annotations.*;

public class Grpex1
{
	@Test(groups={"sanity"})
	public void test1() 
	{
		System.out.println("this test 1 + sanity");
	}

	@Test(groups={"Regression"})
	public void test2() 
	{
		System.out.println("this test 2 + Regression");
	}
	
	@Test(groups={"sanity"})
	public void test3() 
	{
		System.out.println("this test 3 + sanity");
	}
	
	@Test(groups={"Regression"})
	public void test4() 
	{
		System.out.println("this test 4 + Regression");
	}
	
	@Test(groups={"sanity","Regression"})
	public void test5() 
	{
		System.out.println("this test 5 + sanity , Regression");
	}
	
	/*<exclude name="sanity" />....means other than sanity executed */
	
}
