package TestNGDemo;

import org.testng.annotations.Test;

public class ExpectedException {

	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test_1() {
		
		String s = "100A";
		
		System.out.println(Integer.valueOf(s));
		
	}
}
