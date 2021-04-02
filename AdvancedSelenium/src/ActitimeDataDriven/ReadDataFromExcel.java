package ActitimeDataDriven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		//read the data 
		//go to particular Excel File
		FileInputStream fis = new FileInputStream("C:\\Users\\Acer\\Desktop\\Workbook1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
		//go to particular sheet
		Sheet sh=wb.getSheet("Sheet1");
		//go to particular row
		Row r = sh.getRow(1);
		//go to particular cell
		Cell c=r.getCell(1);
		//fetch the string data
		String str=c.getStringCellValue();
		//print it
		System.out.println(str);
		//method chaining
		//System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		
	
	
	
	}
}

