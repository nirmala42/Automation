package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run()
	{
		System.out.println("Consile msg");
		Reporter.log("Report msg");
		Reporter.log("Both Report+Console",true);
	}
	
	

}



