package DataDrivenTesting;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\saikumar\\Desktop\\selenium\\DataDriven.xlsx");
		 FileInputStream  fis  =new FileInputStream(file);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);//this is for .xlsx file
		 XSSFSheet sheet =wb.getSheetAt(0);//always the sheet index start from "0"
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		//rows and columns are always start from "0"

		
		System.out.println(data0);
		System.out.println(data1);
		
		 int rowcount =sheet.getLastRowNum();
 		 
		 System.out.println("total rows is"+rowcount);
		 
		 for(int i=0;i<=rowcount ;i++) {
			 
 			 
			 String data2 = sheet.getRow(i).getCell(0).getStringCellValue();
			 String data3 = sheet.getRow(i).getCell(1).getStringCellValue();
			 String data4= sheet.getRow(i).getCell(3).getStringCellValue();


			 
			 System.out.println("Testdata from Excel is:"+data2+ "\t"+data3+"\t"+data4);
  
			 
		 }

		
		 
		
		
		 
	}

}

