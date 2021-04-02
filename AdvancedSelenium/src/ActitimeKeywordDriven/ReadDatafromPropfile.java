package ActitimeKeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDatafromPropfile {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		//Returns 
//		String propvalue = prop.getProperty("Browser");
		String propvalue = prop.getProperty("Browser","Incorrect key");
		String un = prop.getProperty("username");
		
		System.out.println(propvalue);
		System.out.println(un);
		
		
	}

}
