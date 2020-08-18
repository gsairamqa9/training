package ExcelUtility;

public class TestClass {

	public static void main(String[] args) throws Exception {
		
		ReadExcelData excel = new ReadExcelData();
		excel.excelDataConfig(System.getProperty("user.dir")+"/TestData.xlsx");
		
		System.out.println(excel.getData(0, 1, 1));
	}

}
