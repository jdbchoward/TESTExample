package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PageLogin {
	
	@FindBy(xpath = "//a[@id='rt-logo']")
    private WebElement logo;  
  
  
    public void checkPageTitle(WebDriver driver,String ipaddress, String expectTitle) { 
    	
		driver.get(ipaddress);  
		String realTitle = driver.getTitle();				 
		Assert.assertTrue(realTitle.contains(expectTitle)); 
  
    }  
    
    public String getLogoName()
    {
    	return logo.getTagName();
    }

}
