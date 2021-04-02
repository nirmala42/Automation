package sere_POM_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username") private WebElement untb;
	@FindBy(name = "pwd") private WebElement pwtb;
	@FindBy(xpath = "//div[text()='Login ']") private WebElement loginBtn;
	
    public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
    
    //Address returning Methods
    public WebElement getUntb()
    {
    	return untb;
    }
    
    //Action Performing Methods
    public void setUntb(String un)
    {
    	untb.sendKeys(un);
    }
    
  //Address returning Methods
    public WebElement getPwtb()
    {
    	return pwtb;
    }
    
    //Action Performing Methods
    public void setPwtb(String pw)
    {
    	pwtb.sendKeys(pw);
    }
    
  //Address returning Methods
    public WebElement getLoginBtn()
    {
    	return loginBtn;
    }
    
    //Action Performing Methods
    public void clickLoginBtn()
    {
    	loginBtn.click();
    }

}

