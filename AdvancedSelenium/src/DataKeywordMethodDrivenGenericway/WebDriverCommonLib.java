package DataKeywordMethodDrivenGenericway;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest {
		public String getPageTitle()
		{
			String title = driver.getTitle();
			return title;
		}
		
		public void mouseHover(WebElement element) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		}
		
		public void rightClick(WebElement element)
		{
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();
		}
		
		public void selectOption(WebElement element, String text)
		{
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void selectOption(String value, WebElement element)
		{
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		
		public void selectOption(WebElement element, int index)
		{
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
		
		public void getFullPageScreenshot(String path) throws Throwable
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			Files.copy(src, dest);
		}
		
		public void waitForPageTitle(String title)
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(title));		
		}
		
		public void verify(String actualTitle, String expectedTitle, String page) 
		{
			if(actualTitle.equals(expectedTitle))
			{
				System.out.println(page+" is displayed, Test Step Passed");
			}
			else
			{
				System.out.println(page+" is not displayed, Test Step Failed");
			}
		

	
	}
	}

