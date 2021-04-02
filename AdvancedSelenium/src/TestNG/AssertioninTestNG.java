package TestNG;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class AssertioninTestNG {

		@Test
		public void login() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_88.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(2000);
			String loginTitle = driver.getTitle();
			//Assert.assertEquals(loginTitle, "actiTIME - Log");
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(loginTitle, "actiTIME - Log");
			
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("admin");
			
			
			sa.assertAll();
			
			
		}
		
	}

