import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
 


 
public class Property {
	
	
	
	
	
 	public static WebDriver driver;
	public static   Properties prop;
	public  static EventFiringWebDriver e_driver;

	 public static void main(String args[]) {
		  
			
	

		
		try {
			
			File file = new File("C:\\Users\\saikumar\\eclipse-workspace\\Selenium1\\src\\properties");
			 
			 FileInputStream ip = new FileInputStream(file);
//C:\Users\saikumar\eclipse-workspace\Selenium1\src\properties
     prop = new Properties();
    //load properties file
			prop.load(ip);
			
			System.out.println(prop.getProperty("url"));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 }
	
  
/*  public   void intialization() {
	  
	  String browserName = prop.getProperty("browser");
		 
		if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
				driver = new ChromeDriver();
		 
   driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
 	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
  }
  }
  
  public static void main(String args[]) {
	  
	
	  Property prp = new Property();
	  prp.intialization();
	  
	  
  }
  */
	

