package ExcelWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkOnSheet2 
{
	public static void main(String arg[]) throws EncryptedDocumentException, IOException 
	{
		System.out.println("****Program Start****\n");
		
		/*Create File object to read a file*/
		FileInputStream fis = new FileInputStream("./Excel/ExcelDemo1.xlsx");
		
		/*Create object of workbook factory (So no to append excel version to workbook interface)*/
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet s = wb.getSheet("Assingment");// select particular sheet among excel work book
	
		//Row r = s.getRow(1);// point out first row

		//Cell c = r.getCell(0);// point first row and zero cell value
		
		
		
		/*Get All Sheet Data basically it has only string type data*/
		for(int i =1;i<=s.getLastRowNum();i++)
		{
			Row r = s.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				System.out.print(r.getCell(j).getStringCellValue()+" ...");
			}
			System.out.println();
		}
			
	
		System.out.println("\n****Program End****");
		
	}
}
