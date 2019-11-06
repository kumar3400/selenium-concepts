package writingSeleniumTestcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestcases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		 driver.findElement(By.linkText("Create account")).click();
		    Thread.sleep(3000);
		    String Url = driver.getCurrentUrl();
		    System.out.println(Url);
		    if(Url.contains("wikipedia.org")) {
		    	
		    	System.out.println("It is an Internal Link – Redirected to another page in the Same Application – Passed");
		    }
		    
		    else {
		       
		    	System.out.println("It is an External  Link – Redirected to another page in the Other  Application – Failed");
		    	
		    }
		    
		    driver.navigate().back();
		    Thread.sleep(5000);
		    driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		   String url = driver.getCurrentUrl();
		     System.out.println(url);
		    if (! url.contains("wikipedia.org")){
		    	System.out.println("It is an External Link – Redirected to another page in the Other Application – Passed");
		    	}
		    	else{
		    	System.out.println("It is an Internal Link – Redirected to another page in the same Application – Failed");
		    	}
		    	
		    	
		    	
		    	//Verify Element Existence (Gmail link existence in Google home page)
		    	driver.get("https://www.google.com");
		    	boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();
		    	 
		    	if(existence == true) {
		    		
		    		System.out.println("Gmail link exist-passed");
		    	}
		    	else {
		    		
		    		System.out.println("Gmail link not exist -Failed");
		    	}
		    	
		    	driver.close();
		    	*/
		
		//3) Test Case: Login to Indian Railways Online web Portal
            driver.get("https://www.irctc.co.in/");
            driver.findElement(By.id("loginText")).click();
            driver.findElement(By.id("userId")).sendKeys("gcreddy7");
            driver.findElement(By.id("pwd")).sendKeys("gld938");
            
            
            Scanner sc = new Scanner(System.in);//(System.in as a input stream)
            System.out.println("enter captcha");
            String captcha = sc.nextLine();
            driver.findElement(By.id("otpLogin")).click();
            driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
            
            String Url = driver.getCurrentUrl();
            
            if(Url.equals("https://www.irctc.co.in/eticketing/home")) {
            	
            	System.out.println("Login Successful – Passed");
            }
            else{
            System.out.println("Login Unsuccessful – Failed");
            }
            //driver.close();
            }
            
		
		    
	}


