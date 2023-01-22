package lisenters;

import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

/*For using listners interface we need decleared annotation over Class level
 and Within round bracket (pckg name.classname.class word)
 classname by whom = where we implement ITestListener interFace */

@Listeners(lisenters.listners.class)
public class listnersTest1
{
	@Test
	 public void test1()
	{
		System.out.println("This is Test1 : ");
		Assert.assertEquals("A", "A");
		
	}
	
	@Test
	 public void test2()
	{
		System.out.println("This is Test2 : ");
		Assert.assertEquals("A", "B");
		
	}
	
	@Test
	 public void test3()
	{
		System.out.println("This is Test3 : ");
		throw new SkipException("This is skip Exception");
		
	}
	
}
