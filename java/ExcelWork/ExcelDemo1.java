package ExcelWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo1
{
	public static void main(String arg[]) throws EncryptedDocumentException, IOException 
	{
		System.out.println("****Program Start****\n");
		
		/*Create File object to read a file*/
		FileInputStream fis = new FileInputStream("./Excel/ExcelDemo1.xlsx");
		
		/*Create object of workbook factory (So no to append excel version to workbook interface)*/
		
		Workbook wb = WorkbookFactory.create(fis);
		
		/*it will return all sheet count present in Mentioned ExcelWorkBook
		 And it count normal means start from 1 not from zero*/
		int totalSheet = wb.getNumberOfSheets();
		System.out.println("total Sheet: "+ totalSheet);
		
		/*.getSheetName(0)...
		 it will return sheet NAME for that we need to mentioned index number 
		 here indexing start from zero*/
		String sheetName = wb.getSheetName(0);
		System.out.println("Sheet name at index(0) zero postion: "+ sheetName);
		
		/*All Sheet names*/
		System.out.println("All Sheet names");
		
		for(int i =0;i<totalSheet;i++) 
		{
			System.out.println("Sheet name "+i+" : "+ wb.getSheetName(i));
		}
		
		/*.getSheetIndex("Sheet name")
		 it will return you SHEET INDEXING.. for that we need mentioned sheet name*/
		
		int sheetIndex = wb.getSheetIndex("AllStringType");
		System.out.println("All String Type Sheet indexing value is : "+sheetIndex);
		
		
		System.out.println("\n****Program End****");
		
	}

}
