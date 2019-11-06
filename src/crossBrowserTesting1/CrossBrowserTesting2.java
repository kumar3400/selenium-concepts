package crossBrowserTesting1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting2 {
	
  private static  WebDriver driver;

	private static int browser;

	public static void main(String args[]) throws IOException {
		
		for(browser=1; browser<=2; browser++) {
			if(browser==1) {
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\geckodriver.exe");

				 driver = new FirefoxDriver();

			}
			
			else if(browser==2) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");

				 driver = new ChromeDriver();

		}
			
		
			
				driver.get("https://www.google.com");

				String PageTitle = driver.getTitle();

				if (PageTitle.equals("Google")){
				System.out.println(" Google Application Launched – Passed");
				}
				else {
				System.out.println(" Google Application Not Launched –Failed");
				}
				driver.close();
		
		
		
	

	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\geckodriver.exe");
	
	//WebDriver driver = new FirefoxDriver();
	
	
	/*driver.get("https://www.toolsqa.com/selenium-webdriver/how-to-use-geckodriver/");
	driver.manage().window().maximize();
	
	/*
	//taking screenshot
	/*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("C:\\Users\\saikumar\\Desktop\\selenium\\saik\\screenshot.png"));

                  */
	
 		}

}
}