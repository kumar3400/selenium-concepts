package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class DataProvider1 {

	private static final Object TableName = null;
	public static XSSFCell cell;
	public static XSSFSheet sheet;
	public static WebDriver driver;

	   @DataProvider(name = "userData")

	    public  static Object[][] credentials() throws IOException {
			 
            Object[][] data = testdata();
            return data;

	        // The number of times data is repeated, test will be executed the same no. of times
		   
	   }
	       
		
	//Here we are calling the Data Provider object with its Name

	 @Test(dataProvider = "userData")

	public void test(String sUsername, String sPassword) {
		  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 driver.get("http://www.gcrit.com/build3/admin/");
	   // Argument passed will be used here as String Variable

	 driver.findElement(By.name("username")).sendKeys(sUsername);

		driver.findElement(By.name("password")).sendKeys(sPassword);
		driver.findElement(By.id("tdb1")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
		
	  driver.quit();

	 }
	 
	 public static Object[][]  testdata() throws IOException {
			
 			// Import excel sheet.
			File src = new File("C:\\Users\\saikumar\\Desktop\\selenium\\DataDriven.xlsx");
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
				//driver.findElement(By.name("username")).sendKeys(cell.getStringCellValue());
				 
				// Import data for password.
				cell = sheet.getRow(i).getCell(1);
				  cell.setCellType(cell.CELL_TYPE_STRING);
				//driver.findElement(By.name("password")).clear();	         
				//driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
				// To click on Login button
				//driver.findElement(By.id("tdb1")).click();
				
			
	 		 
				// To click on logout button
				//driver.findElement(By.xpath("//a[contains(text(),'Logoff')]")).click();
				
		  }
		return null;
		 
 		}
}
	 
	 
	 
