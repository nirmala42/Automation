package TestNG;


	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class FlagsOfTestNG {

		@Test(priority = 1)
		public void run()
		{
			Reporter.log("run",true);
		}
		
		
		@Test(priority = 2, enabled = false)
		public void bun()
		{
			Reporter.log("bun",true);
		}
		
		@Test(priority = 3, invocationCount = 10)
		public void gun()
		{
			Reporter.log("gun",true);
		}
		
		
		
	}

