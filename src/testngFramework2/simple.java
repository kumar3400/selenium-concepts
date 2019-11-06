package testngFramework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class simple {


	@Test
	public void verifyValidlogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shutterfly.com/lp/hpp/?s_tnt=511455%3A1%3A0&adobe_mc_sdid=SDID%3D6F0D092CBCDF2762-504E4567021ABD24%7CMCORGID%3D9CAD171B520D17A50A490D44%40AdobeOrg%7CTS%3D1567736270&adobe_mc_ref=https%3A%2F%2Fwww.google.com%2F&CID=SEGOO.BRAND.387_322611_7935750_4958782&gclid=Cj0KCQjw5MLrBRClARIsAPG0WGxMFblBJaCU_vUQBF1Ce44QXwsI5cHQWpxQvb3lzG70tR0d_2g6jQoaAsIFEALw_wcB");
		driver.findElement(By.xpath("//a[contains(text(),'shop customer favorites')]")).click();
}
}