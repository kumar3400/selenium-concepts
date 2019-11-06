package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadimage {

	
	public static void main(String []args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://imgbb.com/");
		
	//	driver.findElement(By.xpath("//button[@id='button_desktop']")).click();
		//Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));
		element.click();
		element.sendKeys("C:\\Users\\saikumar\\Desktop\\photos\\sai.jpg");
 		
 
	}
}
