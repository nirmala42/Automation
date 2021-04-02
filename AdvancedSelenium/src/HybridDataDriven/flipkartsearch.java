package HybridDataDriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkartsearch {
  @Test
  public void f() throws Throwable 
  {
	 
	 BaseTest b=new BaseTest();
	 FileLib f=new FileLib();
		WebDriver wd=b.openBrowser();
		
		LoginPage lp=new LoginPage(wd);
		lp.clickclose();
		
		
		Thread.sleep(3000);
		lp.setSearch(f.getPropValue("search"));
//		//		 addr.sendKeys(Keys.DOWN);
//		addr.sendKeys(Keys.ENTER);	
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//div[@class=\"_3879cV\"and text()='Core i5']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@title=\"Windows 10\"]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class=\"_3879cV\"and text()='Dell']")).click();
//		Thread.sleep(4000);		
//	//	WebElement dropadd = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
//	//	Select sel=new Select(dropadd);
//	//	sel.selectByVisibleText("₹50000");
//		Thread.sleep(2000);
//		List<WebElement> pnames=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//			List<WebElement> pram = driver.findElements(By.xpath("//*[@class='_1xgFaf']//descendant::li[2]"));   
//		List<WebElement> pprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//
//
//		for(int i=0;i<pnames.size();i++)
//		{
//			System.out.println(pnames.get(i).getText()+"===="+pprice.get(i).getText() + "===" + pram.get(i).getText());
//		}

		//Thread.sleep(2000);      
		
	}



  }
  

