package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	
	public void WaitUntilPageLoaded(WebDriver driver)
	{
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//	    wait.until(new ExpectedCondition<Boolean>() {
//	        public Boolean apply(WebDriver driver) {
//	            return ((JavascriptExecutor) driver).executeScript(
//	                "return document.readyState"
//	            ).equals("complete");
//	        }
//	    });
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  
		  //Initially bellow given if condition will check ready state of page.
		  if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		   System.out.println("Page Is loaded.");
		   return; 
		  } 
		  
		  //This loop will rotate for 25 times to check If page Is ready after every 1 second.
		  //You can replace your value with 25 If you wants to Increase or decrease wait time.
		  for (int i=0; i<25; i++){ 
		   try {
		    Thread.sleep(1000);
		    }catch (InterruptedException e) {} 
		   //To check page ready state.
		   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		    break; 
		   }   
		  }
		 
		
	}

}
