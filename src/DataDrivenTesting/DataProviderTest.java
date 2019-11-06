package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	public static WebDriver driver;

   @DataProvider(name = "Authentication")

    public static Object[][] credentials() {
		 

        // The number of times data is repeated, test will be executed the same no. of times
	   

        // Here it will execute two time
	   return new Object[][] {
		   
		   { "admin", "admin@123"}};

            }
	
//Here we are calling the Data Provider object with its Name

 @Test(dataProvider = "Authentication")

public void test(String sUsername, String sPassword) {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
	driver = new ChromeDriver();
	
	
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("http://www.gcrit.com/build3/admin/");
   // Argument passed will be used here as String Variable

 driver.findElement(By.name("username")).sendKeys(sUsername);

	driver.findElement(By.name("password")).sendKeys(sPassword);
	driver.findElement(By.id("tdb1")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
	
  driver.quit();

 }


}
