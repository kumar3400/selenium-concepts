/**
 * 
 */
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author saikshex
 *   refer this link  "http://learn-automation.com/page-object-model-using-selenium-webdriver/"
 *
 */
public class Loginpage {
	
	 public WebDriver driver;
	
   	 By username = By.id("user_login");
     By password = By.id("user_pass");
   	 By loginbutton = By.id("wp-submit");
	
	
	public  Loginpage(WebDriver driver) {
		
		this.driver=driver;
		
		
		
	}
	
	public void LoginWordPress(String userid, String pass) {
		
		
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
		
		
	}
	
	

}
