package ActitimeDataDriven;

public class Readingmultipledata {

	public static void main(String[] args) throws Throwable {
		FileLib flib = new FileLib();
		
		int rc = flib.getRowCount("E:\\AdvancedSelenium\\AdvancedSelenium\\data\\WorkBook1.xlsx","Sheet1");
		System.out.println(rc);
		for(int i=0;i<=rc;i++)
		{
			String text =flib.getCellData("E:\\AdvancedSelenium\\AdvancedSelenium\\data\\WorkBook1.xlsx","Sheet1", i, 0);
			System.out.println(text);
		}
	}
	
		
	}

