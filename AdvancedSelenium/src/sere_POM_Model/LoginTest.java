package sere_POM_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.setUntb("admin");
		Thread.sleep(2000);
		lp.setPwtb("manager");
		Thread.sleep(2000);
		lp.clickLoginBtn();
	}


	}


