

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {

	public  static WebDriver driver ;
	
	@BeforeClass
	public void browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	}
	
	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}
	
	
	@Test(priority=1)
	public void login() {
		
		driver.navigate().to("https://www.flipkart.com");
		
		String title = driver.getCurrentUrl();
		Assert.assertEquals(title, "https://www.flipkart.com/");
	}
	

}
