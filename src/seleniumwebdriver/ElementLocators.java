package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementLocators {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32 \\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
     	driver.findElement(By.id( "identifierId")).sendKeys("india");
		
		
		//1)Email – id locator value
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("india");
		
		
		//2)Name
		driver.findElement(By.name("identifier")).sendKeys("sai");
		
		
	/*	//3)class Name
		driver.findElement(By.className("userid")).sendKeys("userid");
		driver.get("file:///C:/Users/saikumar/Desktop/saikumark/loginpage.html");
		
		*/
		
		//4)tagname
		driver.findElement(By.tagName("input")).sendKeys("hyderabad");
		Thread.sleep(5000);
		
		
		//5)linktext
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		
		//6)partial linktext
		driver.findElement(By.partialLinkText("Gma")).click();
		
		//7)cssSelector
		driver.findElement(By.cssSelector("#gbw > div > div > div.gb_Kd.gb_f.gb_ag.gb_1f > div:nth-child(1) > a")).click();
		
		//8)Xpath
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a\r\n")).click();
		
		
		
		
		
		

		
		
		
		
		
		
		 
		
	}
	

}
