package HandlingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElements2 {

	private static final TimeUnit TimeUnitSeconds = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//11)Handle Image
		//i)General Image(No functionality)
				
		/*driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.id("logo-default")).isDisplayed()); //true;
		//System.out.println(driver.findElement(By.id("logo-default")).getAttribute("title"));//google
		
		//ii)Image Button (Submits)
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		
		//iii)Image link (Directs to another page/location)
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//td[2]//center[1]//a[1]//img[1]")).click();
		
		
		*/
		//12)Handle link
		
		/*driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gm")).click();
		
		/*WebElement gmail_link = driver.findElement(By.className("gb_d"));
		String linkname =gmail_link.getText();
		System.out.println(linkname);
		gmail_link.click();
		
        */
		//13)Handle radiobutton
		
		/*driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=47gtsrhe41613u5r3eqhgdbas7");
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		boolean elementstatus = radiobutton.isEnabled();
		System.out.println(elementstatus);
		Thread.sleep(3000);
		radiobutton.click();
		
		
		//handle dropdownbox
		//driver.navigate().to("http://www.gcrit.com/build3/create_account.php?osCsid=47gtsrhe41613u5r3eqhgdbas7");
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("6");
        //dropdown.selectByVisibleText("India");
          
          List<WebElement> e = dropdown.getOptions();
           int    itemsCount = e.size( );
          System.out.println(itemsCount);
		
          
          //14)Handle check box
          
          WebElement checkbox =driver.findElement(By.name("newsletter"));
          Thread.sleep(2000);
            checkbox.click();
            System.out.println(checkbox.isEnabled());
            
            */
            //15)Handle WebTable/Html table
            
           /* driver.get("file:///C:/Users/saikumar/Desktop/Java-selenium%20tutorials/htmlTable.html");
            String s =driver.findElement(By.id("students")).getText();
            System.out.println(s);
            
            WebElement htmlTable =driver.findElement(By.id("students"));
            
            List <WebElement> rows = htmlTable.findElements(By.tagName("tr"));
            int r =rows.size();
            System.out.println(r);
            
            List <WebElement> cells = htmlTable.findElements(By.tagName("td"));
            int c =cells.size();
            System.out.println(c);
            
            */
            //16)Handling Inline elements
            
             driver.get("https://www.google.com");
             driver.manage().window().maximize();
             driver.findElement(By.xpath("//a[@class='gb_x gb_4b']")).click();
              
          
          
		
		
		
         		
		

	}

}
