package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//we are Yousing PageFactory model

public class Loginpage2 {

	WebDriver driver;

	public Loginpage2(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

//catch lookup means it wont check multiplen times only check ones and next it will check in cache  if webelemnts value will not change we can
	// use other wise we cant use
	@FindBy(id = "user_login")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "user_pass")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;

	@FindBy(how = How.LINK_TEXT, using = "Lost your password?")
	WebElement forgetpassworlink;

	public void LoginWordPress(String userid, String pass) {

		username.sendKeys(userid);
		password.sendKeys(pass);
		submit_button.click();

	}

}
