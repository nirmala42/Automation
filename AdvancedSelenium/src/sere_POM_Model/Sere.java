package sere_POM_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sere {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.setUntb("admin");
//		lp.getUntb().sendKeys("admin"); //Other Method
		
//		WebElement untb = driver.findElement(By.id("username"));
//		driver.navigate().refresh();
//		untb.sendKeys("admin");
	}


	}


