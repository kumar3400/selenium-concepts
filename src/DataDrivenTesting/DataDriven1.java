package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 
import com.google.common.collect.Table.Cell;

public class DataDriven1 {
	 
	
	 WebDriver driver;
	 XSSFCell cell;
	 
	
	@BeforeTest
	
	public void launchBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikumar\\Desktop\\selenium\\saik\\chromedriver_win32(3)\\chromedriver.exe");	
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		
		Thread.sleep(2000);
		
	}
	
 	 
	@Test
	public void FBloginlogout() throws IOException {
		// Import excel sheet.
		File src = new File("C:\\Users\\saikumar\\Desktop\\selenium\\DataDriven1.xlsx");
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
		  //cell.setCellType(cell.CELL_TYPE_STRING);
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
			
			
	  }
	  }
			
			/*
			 * 
			 * import excel 
			 * 
			 * 
			 * 
			 * public class ExcelUtil {

	// get / read the data from Excel file
	public static String TEST_DATA_SHEET_PATH = "/Users/NaveenKhunteta/Documents/workspace/SeptBatchPOMSeries/"
			+ "src/main/java/com/qa/hubspot/testdata/HubSpotTestData.xlsx";

	public static Workbook book;
	public static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {
		try {
			FileInputStream file = new FileInputStream(TEST_DATA_SHEET_PATH);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);

			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				}
			}
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
			 * 
			 * 
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactsPage.createNewContact(title, firstName, lastName, company);
		
	}
			 * 
			 * 
			 * 
			 * 
			 */
	   

	 
		
	
	

}
