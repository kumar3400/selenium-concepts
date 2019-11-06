package HandlingElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingElements3 {
	

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
     driver.get("https://www.shutterfly.com/prints?esch=1");
     
   //  driver.findElement(By.xpath("//*[@id=\"ip2EmailOverlay\"]/span")).click();
     
     Thread.sleep(3000);
     
		
     //driver.findElement(By.name("sFlyPushYes")).click();
    
    //Thread.sleep(3000);
     
		/*Actions builder = new Actions(driver);
		
		WebElement  element = driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Prints')]"));
		
		builder.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Large Format Prints")).click();
		
		*/
		
	/*	/*  Handle mouse actions
		 * 
		 *driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_EAIaIQobChMI3uLg1KH14gIVhpSPCh0BoQ1XEAAYASAAEgL5dvD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMI3uLg1KH14gIVhpSPCh0BoQ1XEAAYASAAEgL5dvD_BwE");
		
		Actions builder = new Actions(driver);
		
		WebElement  element = driver.findElement(By.linkText("Try Prime"));
		
		builder.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Get started")).click();
		*/
		
		
		
		
		
		/*  17)Handle frames
		
		1) Using frame index
		
		Syntax:
		driver.swithchTo().frame(int index);
	 
      */
		
		/*driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		 
			Thread.sleep(2000);
		//switch to 3rd frame 
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(3000);
		
		
		String Url = driver.getCurrentUrl();
		
		if(Url.equals("https://seleniumhq.github.io/selenium/docs/api/java/index.html")) {
			
		    System.out.println("you successfully open the link");
		}
		
		else {
			
			System.out.println("failed to open the link");
		}
		
		//switch from 3rd frame to TopWindow
		
	 
		/*driver.switchTo().defaultContent();
		Thread.sleep(3000);
		*/
		/*2) Using frame name

		Syntax:

		driver.switchTo().frame(String frame Name);
		
		*/
		/*
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		*/
	//	driver.switchTo().frame(0);
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		
		
	}

}
