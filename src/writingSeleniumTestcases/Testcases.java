package writingSeleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases extends UserDefineMethods {
	
	public static void main(String []args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		Testcases obj = new Testcases();
		obj.adminLogin();
		//obj.adminLogin1("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		
	if(url.equals("http://www.gcrit.com/build3/")) {
		System.out.println("Test Case 1: -Redirected to User Interface -Passed");
	}
	else {
	System.out.println("Test Case 1: Redirected to User Interface -Failed");
	}
		
		obj.closebrowser();
		 
	}
	}

       
