package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProEx1 
{
	
	@Test(dataProvider = "loginDataProvider")
	public void loginTest(String email, String pwd) 
	{
		System.out.println(email+" "+pwd);
		
	}
	
	
	@DataProvider(name = "loginDataProvider")
	public Object[][] getdata()
	{
		Object[][] data= {{"abc@gamail.com","123"},{"xyz@gmail.com","456"},{"pqr@gmail.com","789"}};
		return data;
	}
	

}
/* data provider is just provided data from one method to another method... 
 * data provider methods would be with in class or outside the class it will provided the data */
 