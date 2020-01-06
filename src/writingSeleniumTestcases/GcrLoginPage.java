package writingSeleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class GcrLoginPage {
	
	static WebDriver driver;
	
	
	//using user defined method
public void registrationpage() throws InterruptedException {
	
	
		
	driver.get("http://gcrit.com/build3/");
	driver.manage().window().maximize();
	
	//registration page

	driver.findElement(By.linkText("create an account")).click();
	
	
	WebElement radiobutton = driver.findElement(By.name("gender"));
	radiobutton.click();
	
	
	WebElement  firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("Rahman");
	
	WebElement Lastname = driver.findElement(By.name("lastname"));
	Lastname.sendKeys("Mohommed");
	
	WebElement  DOB = driver.findElement(By.id("dob"));
	DOB.sendKeys("10/20/1990");
	
	WebElement email = driver.findElement(By.name( "email_address"));
	email.sendKeys("rahman1237@gmail.com");
	
	
	WebElement streetadress = driver.findElement(By.name("street_address"));
    streetadress.sendKeys("abcd xyz");
	
    WebElement postcode = driver.findElement(By.name("postcode"));
    postcode.sendKeys("12345");
    
    
    WebElement city = driver.findElement(By.name("city"));
    city.sendKeys("Hyderabad");
    
    
    WebElement state = driver.findElement(By.name("state"));
    state.sendKeys("Telangana");
    
   Select Dropdown = new Select(driver.findElement(By.name("country")));
   Dropdown.selectByVisibleText("India");
   
   
   WebElement phonenumber = driver.findElement(By.name("telephone"));
   phonenumber.sendKeys("9234565453");
   
   WebElement checkbox = driver.findElement(By.name("newsletter"));
   checkbox.click();
   
   
   WebElement password = driver.findElement(By.name("password"));
   password.sendKeys("abcd123");
   
   
   WebElement pwdconfirmation = driver.findElement(By.name("confirmation"));
   pwdconfirmation.sendKeys("abcd123");
   
   
   WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
   submit.click();
   
   
 /*  String confirmationmessage = driver.findElement(By.xpath(".//*[@id=’bodyContent’]/h1")).getText();
   
  if(confirmationmessage.equals("your account has been created")) {
	   
	   System.out.println("registration succesfull");
	   
   }else {
	   
	   System.out.println("registration fail");
   }
   
   */
	}
   
	
public void loginPage() throws InterruptedException {
   //log in page

   WebElement login = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
   login.click();
   

   WebElement username = driver.findElement(By.name("email_address"));
   username.sendKeys("rahman1237@gmail.com");
   
   WebElement password1 = driver.findElement(By.name("password"));
   password1.sendKeys("abcd123");
   
   
   
   WebElement submit1 = driver.findElement(By.className("ui-button-text"));
   submit1.click();
   Thread.sleep(3000);

   
   
	String Url = driver.getCurrentUrl();
	
	System.out.println(Url);
	
	if(Url.equals("http://www.gcrit.com/build3/index.php")){
		
	System.out.println("log in sucessful");
	
	}
	else {
		
		System.out.println("log in failed");
	}
	
	driver.close();
	
	}




	
	
	
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
 		
      driver = new ChromeDriver();
    GcrLoginPage obj = new GcrLoginPage();
    obj.registrationpage();
	obj.loginPage();
		
}
}

