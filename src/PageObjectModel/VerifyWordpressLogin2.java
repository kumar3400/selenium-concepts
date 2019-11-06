package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactoryhelper.Browserfactory;

public class VerifyWordpressLogin2 {

	@Test
	public void checkvaliduser() {

		// This will launch browser and specific url
		WebDriver driver = Browserfactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

		// created page object using page factory
		Loginpage2 login_page2 = PageFactory.initElements(driver, Loginpage2.class);

		// call the method
		login_page2.LoginWordPress("admin", "demo123");

	}
}
