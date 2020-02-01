package HandlingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/*
 * 
 * https://www.guru99.com/sikuli-tutorial.html  refer this site for sikuli tutorial
 * 
 */
 
public class uploadimage {

	
	public static void main(String []args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.get("https://upload.photobox.com/en/#computer");
		driver.manage().timeouts().pageLoadTimeout( 10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#imagesrc")).click();
 		//driver.findElement(By.id("button_desktop")).click();
 		Thread.sleep(3000);
		
         Pattern fileNameInput =new Pattern("C:\\Users\\saikumar\\eclipse-workspace\\Selenium1\\src\\HandlingElements\\fileinput.PNG");
         Pattern openButton = new Pattern("C:\\Users\\saikumar\\eclipse-workspace\\Selenium1\\src\\HandlingElements\\openbutton.PNG");
         
         Screen screen = new Screen();
         screen.type(fileNameInput, "C:\\Users\\saikumar\\eclipse-workspace\\Selenium1\\src\\HandlingElements\\pic.jpg");
         screen.click(openButton);
 
	}
}
