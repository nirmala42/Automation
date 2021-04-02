package HybridDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//button[text()='✕']") private WebElement loginclose;
	@FindBy(xpath="//input[@name='q']") private WebElement search;
	
    public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
    
   
        
    //Action Performing Methods
    public void clickclose()
    {
    	loginclose.click();
    }
    
    public void setSearch(String p)
    {
    	search.sendKeys(p);
    }

}

