package TestNG;


	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataDriveninTestNG {

		@DataProvider
		public Object[][] dataBank1()
		{
			
			Object[][] obj = new Object[2][2];
			obj[0][0]="admin1";
			obj[0][1]="manager1";
			
			obj[1][0]="admin2";
			obj[1][1]="manager2";
			return obj;
			
		}
		
		
		
		
		@DataProvider(name="db2")
		public Object[][] dataBank2()
		{
			
			Object[][] obj = new Object[2][3];
			obj[0][0]="admin1";
			obj[0][1]="manager1";
			obj[0][2]="Hyd";
			
			obj[1][0]="admin2";
			obj[1][1]="manager2";
			obj[1][2]="Goa";
			return obj;
			
		}
		
		
		@Test(dataProvider = "db2")
		public void getCred(String un, String pw, String city)
		{
			Reporter.log(un+"---"+pw+"---"+city,true);
		}
		
		
		
		
	}

