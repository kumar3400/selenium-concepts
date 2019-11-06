package writingSeleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class UserDefineMethods {
	
	public static WebDriver driver;
	
	
	//Admin log in without parameters
	public static void adminLogin(){
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		}
	

	//Admin log in without parameters
   public static void adminLogin1(String Username, String password) {
	   
	  driver.get("http://www.gcrit.com/build3/admin/");
	  driver.findElement(By.name("username")).sendKeys(Username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.id("tdb1")).click();
	  
   }
	
	
	//closebrowser
    public static void closebrowser() {
    	
    	driver.close();
    	    	
    }
    
     
    
    
	
	
	
	
	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
	driver = new ChromeDriver();
	UserDefineMethods obj = new UserDefineMethods();
	//.adminLogin();
	obj.adminLogin1("admin","admin@123");
	obj.closebrowser();
	}
	

}
