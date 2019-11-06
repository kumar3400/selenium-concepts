package writingSeleniumTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidInvalid {
	
	static int i;
	static String username, password, iteration;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

	for (i = 1; i <= 3; i++){
	if (i == 1) {
	username = "admin";
	password = "admin@123";
	iteration = "Iteration 1:";
	}
	else if(i == 2){
	username = "admina";
	password = "admin@123a";
	iteration = "Iteration 2:";
	}
	else if(i==3) {
		username = "adminab";
		password = "admin@123ab";
		iteration = "Iteration 3:";
	}


	driver.get("http://www.gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	 
	Thread.sleep(3000);
	driver.findElement(By.id("tdb1")).click(); 

	String url = driver.getCurrentUrl();

	if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Admin LoginSuccessful -Passed");
	driver.findElement(By.linkText("Logoff")).click();
	Thread.sleep(2000);
	}
	else if (! url.contains("http://www.gcrit.com/build3/admin/index.php")){
	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
	if (ErrorMessage.contains("Invalid administrator login attempt.")){
	System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Handling Invalid	Inputs -Passed");
	
	}
	else {
	System.out.println(iteration + "- Failed");
	}
	}
	}
	driver.close();
	
 	}

}
