package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaScriptExecutor {

	
	/*Syntax:
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	 js.executeScript(Script,Arguments);
	 script - The JavaScript to execute
	 Arguments - The arguments to the script.(Optional)*/
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void init() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumhq.org");
 	
}
	
	@Test
	public void logintext() throws InterruptedException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;

         
        
       // WebElement loginButton = driver.findElement(By.xpath("//span[(contains(text(),'Next'))]"));
        //js.executeScript("arguments[0].click();",loginButton);
		    js.executeScript("alert('hello world');");
	  
		    
		
		//to refresh browser window using Javascript 
		js.executeScript("history.go(0)");
		
		Thread.sleep(2000);
		
		//to get the Title of our webpage
		 String sText =  js.executeScript("return document.title;").toString();
		 System.out.println(sText);
		 Thread.sleep(2000);
		 
		 // for scrolling till the bottom of the page we can use the code like
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     
  
        

	}
}
