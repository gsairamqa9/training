package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	File srcFile;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public void excelDataConfig(String filePath) throws Exception {
	
		
		 try {
			srcFile = new File(System.getProperty("user.dir")+"/TestData.xlsx");
			 fis = new FileInputStream(srcFile);
			
			 wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 
		
	}
	
	
	public String getData(int sheetNumber, int rownumber, int ColumnNumber) {
		
		  sheet = wb.getSheetAt(sheetNumber);
		
		 String data= sheet.getRow(rownumber).getCell(ColumnNumber).getStringCellValue();
		
		
		return data;
		
	}
	
	
}
