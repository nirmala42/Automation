package ActitimeDataDriven;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;

		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;

		public class FileLib {

			public String getCellData(String excelPath, String sheetName, int row, int cell) throws Throwable {
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				String excelValue = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				return excelValue;
			}
			
			public void setCellData(String excelPath, String sheetName, int row, int cell, String data)throws Throwable {
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				wb.getSheet("Sheet1").getRow(0).createCell(0).setCellValue(data);
				FileOutputStream fos = new FileOutputStream(excelPath);
				wb.write(fos);		
			}
			
			public int getRowCount(String excelPath, String sheetName)throws Throwable
			{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				int rc = wb.getSheet(sheetName).getLastRowNum();
				return rc;
			}

		
		}
	


