package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;


//please refer this site for DataDriven testing
//https://www.softwaretestingmaterial.com/data-driven-framework-selenium-webdriver/#Why-Data-Driven-Framework

public class DataDrivenWritefile {
	
	
	 WebDriver driver;
	 XSSFCell cell;
	 XSSFSheet sheet;
	 
	 
	
	@BeforeTest
	
	public void launchBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		
		Thread.sleep(2000);
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void FBloginlogout() throws IOException {
		// Import excel sheet.
		File src = new File("C:\\Users\\saikshex\\Desktop\\DataDriven.xlsx");
		//load the file
		FileInputStream fis = new FileInputStream(src);
		 // Load the workbook.
	  XSSFWorkbook	workbook = new XSSFWorkbook(fis);
		// Load the sheet in which data is stored.
	  XSSFSheet	 sheet= workbook.getSheetAt(0);
	  for(int i =0;i<=sheet.getLastRowNum();i++) {
		// Import data for usrename.
		   cell = sheet.getRow(i).getCell(0);
		  cell.setCellType(cell.CELL_TYPE_STRING);
		 // driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(cell.getStringCellValue());
			 
			// Import data for password.
			cell = sheet.getRow(i).getCell(1);
			  cell.setCellType(cell.CELL_TYPE_STRING);
			//driver.findElement(By.name("password")).clear();	         
			driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
			// To click on Login button
			driver.findElement(By.id("tdb1")).click();
			
		
 		 
			// To click on logout button
			driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
			
			
			String message = "data imported successfully";
			
			// Create cell where data needs to be written.
            sheet.getRow(i).createCell(3).setCellValue(message);
            
         // Write data in the excel.
         			FileOutputStream fos = new FileOutputStream(src);
         			
         			workbook.write(fos);
         			
         			fos.close();
         			
         			String UrL =driver.getCurrentUrl();
         			System.out.println(UrL);

         			
         			Assert.assertEquals("http://www.gcrit.com/build3/admin/login.php",UrL);
         			
         		
	   
	  }
	 
		
	}
	

}



