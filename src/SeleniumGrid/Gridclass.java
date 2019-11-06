package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridclass {
	
	
	/*
	 * for hub:
        java -jar "selenium-server-standalone-3.141.59 (1).jar" -role hub
        
      for node:
   java -Dwebdriver.chrome.driver=webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe -jar 
   "selenium-server-standalone-3.141.59 (1).jar" -role node -hub http://192.168.0.103:4444/grid/register/

	 * 
	 */
	

	
	public static void main(String []args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities( );
		//1.define des cap
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		// chrome options definition
		
		ChromeOptions opt = new ChromeOptions();
		opt.merge(cap);
		
		String huburl ="http://192.168.0.103:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(huburl),opt);
		
		
		driver.get("https://www.guru99.com/introduction-to-selenium-grid.html#2");
		System.out.println(driver.getTitle());
	}
}
