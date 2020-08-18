package TestNGDemo;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNgGroupsDemo {

	
	@Test(groups = {"Sanity","Regression","UAT"})
	public void test() {
		System.out.println("Test case 1");
	}
	
	@Test(groups = "Regression")
	public void test1() {
		System.out.println("Test case 2");
	}
	
	@Test(groups = "Sanity")
	public void test2() {
		System.out.println("Test case 3");
	}
	
	@Test(groups = "Regression")
	public void test3() {
		System.out.println("Test case 4");
	}
	
	@Test(groups = "UAT")
	public void test4() {
		System.out.println("Test case 5");
	}
	
	@Test(groups = "UAT")
	public void test5() {
		System.out.println("Test case 6");
	}
	
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	
	
	
}
