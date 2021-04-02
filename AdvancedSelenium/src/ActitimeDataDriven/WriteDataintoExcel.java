package ActitimeDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataintoExcel {

	
		public static void main(String[] args) throws Throwable {
		
			//read the data 
			//go to particular Excel File
			FileInputStream fis = new FileInputStream("./data/WorkBook1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
			//go to particular sheet
			Sheet sh = wb.getSheet("Sheet1");
			//go to particular row
			Row r = sh.getRow(2);
			//go to particular cell and keep it ready for writing
			Cell c=r.createCell(1);
         //writting data
         c.setCellValue("raju");

			//	open file in write mode

				FileOutputStream fos=new FileOutputStream("./data/WorkBook1.xlsx");
				wb.write(fos);
              System.out.println("Done");
		}
	
	}


