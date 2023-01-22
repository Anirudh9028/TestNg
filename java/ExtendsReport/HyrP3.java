package ExtendsReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class HyrP3 {

	public static void main(String[] args) 
	{
		
		ExtentReports extentreport = new ExtentReports();// create object of  Extent report
		
		/*// Parametric constructor of free report format assigned by Extent report, 
		 * in parameter we need to pass file save file path + file name +.html extension*/
		ExtentSparkReporter sparkreport = new ExtentSparkReporter("E:\\eclips pro file\\TestNG\\src\\test\\java\\ExtendsReport\\extent Report\\P3.html");		
		extentreport.attachReporter(sparkreport);// attacted report location to the report format
		
	
		/* create test case
		 * .createTest(test case name , test case description) */
		ExtentTest test1 = extentreport.createTest("test 1", "first one");
		test1.pass("this is passed");
		
		/*another way to do this*/
		extentreport.createTest("test 2", "Second test case").skip("This is skipped test case");
		
		
		/*another way to do this*/
		ExtentTest test3 = extentreport.createTest("test 3", "Second test case");
		test3.log(Status.FAIL,"This is failed");
		
		// HYR p6
		extentreport
		.createTest("test 4 Text ")
		.log(Status.INFO,"<b> info for bold font</b>")
		.log(Status.INFO,"<i> info for italic font </i>")
		.log(Status.INFO,"<b><i> info for bold & italic font</i></b>");
		
		
		// Log xml and json data in report 
		
		String jsondata = "{\"employees\":[  \r\n"
				+ "    {\"name\":\"Shyam\", \"email\":\"shyamjaiswal@gmail.com\"},  \r\n"
				+ "    {\"name\":\"Bob\", \"email\":\"bob32@gmail.com\"},  \r\n"
				+ "    {\"name\":\"Jai\", \"email\":\"jai87@gmail.com\"}  \r\n"
				+ "]}  ";
				
		
		String xmldata =" <catalog>\r\n"
				+ "   <book id=\"bk101\">\r\n"
				+ "      <author>Gambardella, Matthew</author>\r\n"
				+ "      <title>XML Developer's Guide</title>\r\n"
				+ "      <genre>Computer</genre>\r\n"
				+ "      <price>44.95</price>\r\n"
				+ "      <publish_date>2000-10-01</publish_date>\r\n"
				+ "      <description>An in-depth look at creating applications \r\n"
				+ "      with XML.</description>\r\n"
				+ "   </book> ";
		
		/* Using below method you create special space in report
		 * for that u need to pass...data and format of data in that
		 * then and then it only works
		 * MarkupHelper = used to make proper format
		 * MarkupHelper.createCodeBlock(xmldata, CodeLanguage.XML)*/
		extentreport
		.createTest("test 5 xml data ")
		.log(Status.INFO, MarkupHelper.createCodeBlock(xmldata, CodeLanguage.XML));
		
		/* for Json data*/
		extentreport
		.createTest("test 6 Json data ")
		.log(Status.INFO, MarkupHelper.createCodeBlock(jsondata, CodeLanguage.JSON));
		
		/*log the collection data
		 * MarkupHelper.createOrderedList(listData)
		 * .createOrderedList(listData) = log the data in numbering format
		 * .createUnorderedList(listData) = log the data in bullet format
		 * */
		
		// String data
		List<String> listData = new ArrayList<String>();
		
		listData.add("vikaram");
		listData.add("Anirudh");
		listData.add("Akshay");
		
		extentreport
		.createTest("test 7 list Data")
		.log(Status.INFO, MarkupHelper.createOrderedList(listData))
		.log(Status.INFO, MarkupHelper.createUnorderedList(listData));
		
		// map data
		Map<Integer , String> mapData = new HashMap<Integer ,String>();
		
		mapData.put(101," vikaram");
		mapData.put(102," Anirudh");
		mapData.put(103," Akshay");
		
		extentreport
		.createTest("test 8 Map Data")
		.log(Status.INFO, MarkupHelper.createOrderedList(mapData))
		.log(Status.INFO, MarkupHelper.createUnorderedList(mapData));
		
		//set data
		Set<Integer> setData = mapData.keySet();
		
		extentreport
		.createTest("test 9 Set Data")
		.log(Status.INFO, MarkupHelper.createOrderedList(setData))
		.log(Status.INFO, MarkupHelper.createUnorderedList(setData));
		
		/*highlight the description msg 
		 * for you need to call MarkupHelper class and 
		 * .createLabel("type msg ", provide color) this method*/
		
		extentreport
		.createTest("test 10 highlight msg ")
		.log(Status.INFO, "This is without highlight msg")
		.log(Status.INFO, MarkupHelper.createLabel("This is highlight msg", ExtentColor.BLUE));
		
		/* log the exception in report
		 * */
		// checked exception
		
		try {
			int n = 5/0;
		}catch (Exception e) {
			extentreport
			.createTest("test 11 checked exception log ")
			.log(Status.FAIL, e);
		}
		
		// customize exception or runtime exception
		Throwable tb = new RuntimeException("This is a customize exception");
		extentreport
		.createTest("test 12 customize exception log ")
		.log(Status.FAIL, tb);
		
		
		
		
		
		
		
		// it will wrap up all extent report method class to report
		extentreport.flush();

	}

}
