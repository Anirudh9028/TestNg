package ExcelWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllTypeDataPrint 
{
	public static void main(String arg[]) throws EncryptedDocumentException, IOException 
	{
		System.out.println("****Program Start****\n");
		
		/*Create File object to read a file*/
		FileInputStream fis = new FileInputStream("./Excel/ExcelDemo1.xlsx");
		
		/*Create object of workbook factory (So no to append excel version to workbook interface)*/
		Workbook wb = WorkbookFactory.create(fis);
		
		/*Sheet interface
		 To call particular sheet...*/
		Sheet s = wb.getSheet("TestData");
		
		/*.getCellType()....return data type of cell value
		 to print all kind of data first get cell type
		 According cell data type call methods*/
		
		for(int i =0;i<=s.getLastRowNum();i++)
		{
			Row r = s.getRow(i);
			
			for(int j=0;j<r.getLastCellNum();j++)
			{
				//System.out.print(r.getCell(j).getStringCellValue()+" ...");
				CellType ct = r.getCell(j).getCellType();
				
				//System.out.println(ct);
				
				switch(ct) {
				
				case STRING: System.out.print(r.getCell(j).getStringCellValue()+" ...");break;
				
				case NUMERIC: if(DateUtil.isCellDateFormatted(r.getCell(j))) 
								{ SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
								System.out.print(sdf.format(r.getCell(j).getDateCellValue())+" ...");break;}
				
							  else {System.out.print((long)r.getCell(j).getNumericCellValue()+" ...");break;}
				
				case BOOLEAN: System.out.print(r.getCell(j).getBooleanCellValue()+" ...");break;
				
				case FORMULA: System.out.print(r.getCell(j).getCellFormula()+" ...");break;
				
				case BLANK : System.out.print("cell is blank!"+" ...");break;
				
				
				
				default: System.out.println("Invalid cell type");
				
				}	
				
			}
			System.out.println();
		}
			
	System.out.println("\n****Program End****");
		
	}
}
