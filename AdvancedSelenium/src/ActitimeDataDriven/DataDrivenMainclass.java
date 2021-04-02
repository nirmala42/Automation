package ActitimeDataDriven;

public class DataDrivenMainclass {

	public static void main(String[] args) throws Throwable {
	FileLib flib = new FileLib();
	String text = flib.getCellData("./data/WorkBook1.xlsx","Sheet1", 1, 0);
	System.out.println(text);
		flib.setCellData("./data/WorkBook1.xlsx","Sheet1", 4, 1,"Balayya");
		
	}
}

		
	


