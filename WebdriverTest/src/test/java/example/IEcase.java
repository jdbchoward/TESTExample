package example;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class IEcase {		
	    private WebDriver driver;	    
	    static Logger log = Logger.getLogger(IEcase.class.getName());
		@Test				
		public void testEasy() {	
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			
			//---
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(new ExpectedCondition<Boolean>() {
		        public Boolean apply(WebDriver wdriver) {
		            return ((JavascriptExecutor) driver).executeScript(
		                "return document.readyState"
		            ).equals("complete");
		        }
		    });
			
			//--
		    System.out.println(driver.getTitle());
			String title = driver.getTitle();	
			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.out.println("Internet Explorer is selected");
			System.setProperty("webdriver.ie.driver","src\\test\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
		
		
}	