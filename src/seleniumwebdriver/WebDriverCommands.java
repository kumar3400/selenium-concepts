package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
 		/*
		1) getTitle()
         description;Returns Title of the Browser.
         */
		driver.get("https://services.harman.com/");
		driver.manage().window().maximize();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		/*2)getCurrentUrl();
		 * Returns Current URL of the Browser.
		 */
		String Url =driver.getCurrentUrl();
		System.out.println("the current Url is:"+Url);
		
		/*3) getPageSource()
		 * Returns HTML page source.
		String name =driver.getPageSource();
		System.out.println("the current pageSource is:"+name);
 		
		*/
		
		
		/*4)navigate().to();
		 * 
		 * Loads a new web page in the current browser window.
		 */
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Harman_Connected_Services");
		String newpage = driver.getCurrentUrl();
		System.out.println("\n the new page url  is:"+newpage);
		
		
		
		/*5)navigate().back();
		 * 
		 * It moves a single item back in the Browser history.
		 */
		driver.navigate().back();
		String page1 =driver.getCurrentUrl();
		System.out.println("\n the  back page url  is:"+page1);

		
		
		/*6)navigate().forward();
		 * 
		 * It moves a single item back in the Browser history.
		 */
		driver.navigate().to("https://en.wikipedia.org/wiki/Harman_Connected_Services");
		String newpage1 = driver.getCurrentUrl();
		System.out.println("\n the new page url  is:"+newpage1);
		driver.navigate().back();
		String page11 =driver.getCurrentUrl();
		System.out.println("\n the  back page url  is:"+page11); 
		
		driver.navigate().forward();
		
		String page2 =driver.getCurrentUrl();
		System.out.println("\n the  forward page url  is:"+page2);
		
		Thread.sleep(3000);
		
		
		
		/*7) navigate().refresh()
		Refresh the current web page
		*/
		
		
           driver.navigate().refresh();
           
		

		

	}

	 

}
