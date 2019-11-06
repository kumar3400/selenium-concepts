package HandlingElements;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlingelements1 {
	
	
	public static void main(String []args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get( "https://www.gmail.com/");
	
	driver.manage().window().maximize();
	
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	
	
	/*String pagesource =driver.getPageSource();
	System.out.println(pagesource);
	*/
	
	/*String Windowhanle =driver.getWindowHandle();
	System.out.print(Windowhanle);
	
	Thread.sleep(3000);
	
	//driver.close();
	
 	*/
	
	//1)Handling editbox
	//Finding Edit box using id locator
 /* WebElement email=	driver.findElement(By.id( "identifierId")) ;
      email.sendKeys("gcrindia");
     System.out.println(email.getText()); 
     System.out.println(email.isDisplayed());//true
     System.out.println(email.isEnabled());//true
    
	Thread.sleep(2000);
	

	//Finding Edit box using name locator
	driver.findElement(By.name("identifier")).sendKeys("gcrindia");

	
	

	//clear the value
	//driver.findElement(By.id( "identifierId")).clear();
	 
	
	
	
	//2)handle text area/Error message
	String  textarea  =driver.findElement(By.id( "headingSubtext")).getText();
	System.out.println(textarea);
	Thread.sleep(2000);
	
	
	//3)Handle button
	driver.findElement(By.id("identifierNext")).click();
	System.out.println(driver.findElement(By.id("identifierNext")).isEnabled());
	Thread.sleep(3000);
	
	
	 
	 
       //5)handle dropdown
     /*  driver.get("https://www.toolsqa.com/automation-practice-form");
        driver.manage().window().maximize();
        Select dropdown = new Select(driver.findElement(By.id("continents")));
        dropdown.selectByIndex(3);
        Thread.sleep(3000);
        
        
        //6)Handle menu item with link text 
		driver.get("https://phptravels.org/clientarea.php");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("languageChooser")); 
		element.click();
		 Thread.sleep(2000);  
	    driver.findElement(By.linkText("Magyar")).click();
	    */
	    
	    //7)capture error message
	   /*    driver.get("https://twitter.com/login/");
	       driver.manage().window().maximize();
	        driver.findElement(By.xpath("//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
	          String ErrorMessage = driver.findElement(By.xpath("//span[@class='message-text']")).getText();
	          System.out.println(ErrorMessage);
*/

		 //8 handle window popup
	          
	       /*   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	          driver.manage().window().maximize();
	          driver.findElement(By.name("proceed")).click();
	          Thread.sleep(2000);  
	          
	          Alert alert =driver.switchTo().alert();
	          String Errmessage = alert.getText();
	          System.out.println(Errmessage);	          
	          driver.switchTo().alert().accept();
	          thread.sleep(2000);

*/
	   
	    //9)handling mouse hover
	  /*  driver.get("http://www.carmax.com/");
		//create Action builder instance by passing WebDriver instance
		Actions builder = new Actions(driver);
		WebElement menuElement = driver.findElement(By.xpath("//span[@class='header-helpful-links-title']"));
		builder.moveToElement(menuElement).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("FAQ")).click();
		
		*/
		
	
	
	
	    //10)autocomple view 
	
		/*driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_web_desktop_order_na_search_bangalore_search_brand_newuser&gclid=EAIaIQobChMIis6tvYzr4gIVRYuPCh0YCAJpEAAYASAAEgJNV_D_BwE");
	    driver.manage().window().maximize(); 
		Thread.sleep(2000); 
	    WebElement autoOptions= driver.findElement(By.id("location"));
	    autoOptions.sendKeys("hyderabad");
	    Thread.sleep(2000);

	    List<WebElement> optionsToSelect = driver.findElements(By.xpath(" //div[@class='Al5GE']//div[1]//span[2]"));//we should use findElements for list
          String  textToSelect ="Hyderabad, Telangana, India";
	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals(textToSelect)) {
	            System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
	        }
	        
      */
	
 	      
	  	       
	  	      
	  	      
	  	      
	  	      
                              
	    
	    }    
	    }

 
