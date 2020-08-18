package TestNGDemo;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount = 1)
	public void Test1() {
		System.out.println("Test- 1");
	}
	
	
	@Test(timeOut = 2000)
	public void Test_1() {
		
		int i =1;
		
		while(i==1) {
			System.out.println(i);
		}
	}
	
	
}
