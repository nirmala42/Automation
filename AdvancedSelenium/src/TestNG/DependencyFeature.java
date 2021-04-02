package TestNG;

	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class DependencyFeature {

		@Test(priority = 1)
		public void register()
		{
			Assert.fail();
			Reporter.log("Registered succesfully",true);
		}
		
		@Test(priority = 2, dependsOnMethods = "register")
		public void delete()
		{
			Reporter.log("Deleted succesfully",true);
		}
		
		
	}

