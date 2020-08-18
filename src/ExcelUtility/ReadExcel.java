package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File srcFile = new File(System.getProperty("user.dir")+"/TestData.xlsx");
		FileInputStream fis = new FileInputStream(srcFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//System.out.println(wb.getActiveSheetIndex());
		
		XSSFSheet sheet = wb.getSheetAt(0);
		 
		int rowCount = sheet.getLastRowNum();
		
		System.out.println(rowCount);
		
		for (int i = 0; i < rowCount; i++) {
			
			  XSSFCell cellvalue = sheet.getRow(i).getCell(0);
			  System.out.println(cellvalue);
			
		}
	
		
		
		
		
		
		// System.out.println(sheet.getRow(0));
		 
		wb.close();
	}

}
