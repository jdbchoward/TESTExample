package TestSuite1;

import org.testng.annotations.Test;

import PageObjects.BrowserLoader;
import PageObjects.BrowserTypes;
import PageObjects.CommonActions;
import PageObjects.PageLogin;
import PageObjects.Wait;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class StartBrowserWithParameter {
	
	 private WebDriver driver;
	    private String ipaddress="http://www.guru99.com/selenium-tutorial.html";
	    private String expectTitle= "Free Selenium Tutorials";
	    private Wait wait;
	     
 
	@Test
	public void testEasy() {	
		

//		CommonActions common = PageFactory.initElements(driver, CommonActions.class);
//
//		PageLogin pageLogin = PageFactory.initElements(driver, PageLogin.class);
//		
//		wait = new Wait(driver);
//		String logoname = pageLogin.getLogoName();  
//		pageLogin.checkPageTitle(driver,ipaddress,expectTitle); 
		driver.get("http://www.guru99.com/selenium-tutorial.html");  			
		wait = new Wait(driver);
		wait.WaitUntilPageLoaded();
	}

	
  @BeforeTest
  public void beforeTest() {
	  
		BrowserLoader brower = new BrowserLoader(BrowserTypes.chrome);
		driver = brower.driver; 
  }

  @AfterTest
  public void afterTest() {
  }

}
