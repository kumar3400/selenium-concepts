package PageFactoryhelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {

	 public static WebDriver driver;
	 
	 
	public  static WebDriver startBrowser(String Browsername, String url) {
		
		if(Browsername.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");

	driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		return driver;
		
	}
	
	
}
