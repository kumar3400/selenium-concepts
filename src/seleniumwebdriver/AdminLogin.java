package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty ("webdriver.gecko.driver","C:\\Users\\saikumar\\Desktop\\selenium\\saik\\geckodriver-v0.24.0-win32\\geckodriver.exe");

		
		//WebDriver driver = new FirefoxDriver(); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		 
			Thread.sleep(5000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin@123");
		 driver.findElement(By.id("tdb1")).click();
		 
		 String url =driver.getCurrentUrl();
			 
			 if(url.equals("http://www.gcrit.com/build3/admin/index.php")) {
				 
				 System.out.println("log in succesfull passed");
		 }
			 else {
				 
				 System.out.println("log in unsuccesfull failed");

			 }
		
		
		
		
		
		driver.close();//closes the browser
		
		

	}

}
