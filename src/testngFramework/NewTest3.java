package testngFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {

   public static WebDriver driver;
  @Test
  public void Test1() throws InterruptedException {
	  
	  System.out.println("test 1 is "+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		
  }
  
  
  @Test
  public void Test2() throws InterruptedException {
	  
	  System.out.println("test 2 is "+Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		driver.quit();
  }
  
}
