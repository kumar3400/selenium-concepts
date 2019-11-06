package testngFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DataDrivenTesting.DataDriven1;

 
public class NewTest1 {
  
	public static WebDriver driver;
	NewTest2 newTest;
	 

	// This method is to navigate snapdeal URL
	@BeforeClass
	public void init() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
	}

	// To log in flipkart
	@Test
	public void login() {
		driver.navigate().to("https://www.snapdeal.com");
		String url =driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.snapdeal.com/");
 		 
		

	}
		  

	@AfterClass
	public void quit() {
	
		driver.close();
		
	}
	
}
