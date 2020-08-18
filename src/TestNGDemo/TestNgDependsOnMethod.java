package TestNGDemo;

import org.testng.annotations.Test;

public class TestNgDependsOnMethod {

	
	
	@Test
	public void Test_1() {
		
		
		System.out.println("Test_1");
		int i = 10/0;
	}
	
	
	
	@Test(dependsOnMethods = "Test_1")
	public void Test_2() {
		System.out.println("Test_2");
	}
	
	
	@Test(dependsOnMethods = "Test_2")
	public void Test_3() {
		System.out.println("Test_3");
	}
}
