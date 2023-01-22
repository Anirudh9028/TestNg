package ExcelWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkOnSheet 
{
	public static void main(String arg[]) throws EncryptedDocumentException, IOException 
	{
		System.out.println("****Program Start****\n");
		
		/*Create File object to read a file*/
		FileInputStream fis = new FileInputStream("./Excel/ExcelDemo1.xlsx");
		
		/*Create object of workbook factory (So no to append excel version to workbook interface)*/
		Workbook wb = WorkbookFactory.create(fis);
		
		
		/*SHEET is interface
		  Here we choose particular sheet for work
		 For that we have method...wb.getSheet("sheet name");
		 And it will return you object.. and using this object we perform different different operations
		 */
		
		Sheet s = wb.getSheet("Assingment");
		
		/*s.getLastRowNum()
		 This method return int value of rows present in sheet
		 It will count from 0 and count EMPTY cell Also
		 * */
		System.out.println("Last Rows Count Start From 0 : "+ s.getLastRowNum());
		
		/*s.getPhysicalNumberOfRows();
		 This method return int value of active(Filled with data) rows present in sheet
		 It will count from 1 and DOES NOT count Empty cell Also*/
		
		System.out.println("Physical Number Of Rows,Count Start From 1 : "+s.getPhysicalNumberOfRows()+"\n");
		System.out.println("*********************************ROW interface****************************************************");
		
		/*ROW interface
		 s.getRow(row count) return the row as object
		 */
		
		Row r = s.getRow(1);// point out first row
		
		/*if you want accesses particular cell or all cell then you need to decide first at which rows cell*/
		
		/*here both cell method Start counting from 1 not from 0
		 Both return type are int
		.getPhysicalNumberOfCells().....method count only active cell present in mentioned rows
		.getLastCellNum().......method count EMPTY cell as well present in mentioned rows
		 */
		System.out.println("At row first count only Active cell number: "+r.getPhysicalNumberOfCells());
		System.out.println("At row first count cell number: "+r.getLastCellNum()+"\n");
		
		System.out.println("*********************************CELL interface****************************************************");
		
		/*to get cell value first we need to point the cell at particular row
		 After pointing to cell... call the particular...cell methods with respective to their data type
		 
		  r.getCell(1).....just point cell which is present at row 1(s.getRow(1))
		  */
		
		Cell c = r.getCell(0);
		
		System.out.println(c.getStringCellValue());// to get String cell value 
		
		
		
	
		System.out.println("\n****Program End****");
		
	}
}
