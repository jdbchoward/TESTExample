package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;		
import org.testng.annotations.Test;

import PageObjects.CommonActions;
import PageObjects.PageLogin;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;
	    private String ipaddress="http://www.guru99.com/selenium-tutorial.html";
	    private String expectTitle= "Free Selenium Tutorials";
		@Test				
		public void testEasy() {	
			
			CommonActions common = PageFactory.initElements(driver, CommonActions.class);
			common.WaitUntilPageLoaded(driver);
			PageLogin pageLogin = PageFactory.initElements(driver, PageLogin.class);			
			String logoname = pageLogin.getLogoName();  
			pageLogin.checkPageTitle(driver,ipaddress,expectTitle); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			//driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		    ChromeOptions options=new ChromeOptions();
		    options.addArguments("no-sandbox");
			driver = new ChromeDriver();
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	