package TestNG;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class CrossBrowserParallel {

		@Parameters("browser")
		@Test
		public void openBrowser(String browserName)
		{
			WebDriver driver;
			if(browserName.equalsIgnoreCase("chrome"))
			{
			
				driver=new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				
		
				driver=new FirefoxDriver();
			}
			
			
		}
	}

