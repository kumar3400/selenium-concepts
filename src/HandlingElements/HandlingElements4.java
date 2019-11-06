package HandlingElements;

import org.junit.Before;
 import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingElements4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 		
	   
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
	  
		
		 
	  //double click
	  
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'What is Selenium?')]"));
		action.doubleClick(element).perform();
		
		if(action.doubleClick(element) != null) {
			
			System.out.println("successfully clicked");
		}
		else {
			System.out.println("failed to click");
		}
	  
		//Right click
		 
		Thread.sleep(3000);
 		WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'submit')]"));
		action.contextClick(element1).perform();
		
     if(action.contextClick(element1) != null) {
			
			System.out.println("successfully clicked");
		}
		else {
			System.out.println("failed to click");
		}
		
	  
	  
	   
        //to perform Scroll on application using  Selenium
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,250)","");
     

	  }
	  
	 

}
