package Log4j;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/*
 * what is log? capturing the information/activitys at  the time of program execution
 * 
 * types:
 *1.info
 *2.warn
 *3.Error
 *4.fatal
 *
 *how to generate the logs4j: use apache Log4j API (log 4j)
 *how it works:it reads log4j configuration from log4j.properties file
 *where to create:create inside the resource folder
 */

public class generateLogs {
	WebDriver driver;
	
	Logger log =Logger.getLogger(generateLogs.class);
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
	driver = new ChromeDriver();
	log.info("launching chrome browser");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	log.info("launching gmail url");


      }
	
     @Test	
	 public void Verifytitle() {
			String pagetitle  =driver.getTitle();
			Assert.assertEquals(pagetitle,"Gmail");
			log.info(pagetitle);

		}
     
     @Test
     public void checkelement() {
    	 
    	 boolean b = driver.findElement(By.id("identifierId")).isDisplayed();
    	 Assert.assertTrue(b);
    	 log.info(b);
     }
	
	
	@AfterMethod
    public void teardown() {
		driver.close();
		log.info("close the driver");
		
	}
	
}
