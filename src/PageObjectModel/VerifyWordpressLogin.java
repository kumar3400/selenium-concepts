package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyWordpressLogin {
	
	
	@Test
	public void verifyValidlogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		Loginpage loginpage = new Loginpage(driver);
		
		loginpage.LoginWordPress("admin","demo123");
		
		 
		
		
	}

}
