package dataProvider;

import org.testng.annotations.Test;

public class dataEx2
{
	/*here just import a data from one class to here using data provider technique
	 For that use this syntax (dataProvider ="dataProvider name",dataProviderClass= DataProvider class name.class ) */
	
	@Test(dataProvider ="loginDataProvider",dataProviderClass= DataProEx1.class )
	public void loginTest(String email ,String pwd) 
	{
		System.out.println(email+" "+pwd);
	}
	
	
	
	
	

}
