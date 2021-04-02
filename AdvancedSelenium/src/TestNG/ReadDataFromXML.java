package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXML {

	@Parameters({"browser","city"})
	@Test
	public void readData(String br, String city)
	{
		Reporter.log(br+"---"+city,true);
	}
}

