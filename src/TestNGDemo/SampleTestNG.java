package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {

	/*
	 * 
beforeSuite----->Set properties for Chrome
BeforeTest----->launching chrome browser
BeforeClass----->lauch URL



BeforeMethod----->login to App
Test----->Search
AfterMethod----->Logout from App


BeforeMethod----->login to App
Test----->Send mail
AfterMethod----->Logout from App



BeforeMethod----->login to App
Test----->check title
AfterMethod----->Logout from App



AfterClass----->delete all cookies
AfterTest----->CLose the browser
	 * 
	
	 * 
	 * 
	 */
	
	
	//Pre-Condition will be @Before
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite----->Set properties for Chrome");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest----->launching chrome browser");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("BeforeClass----->lauch URL");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("BeforeMethod----->login to App");
	}
	
	//TestCase will be @Test
	@Test
	public void GoogleTest() {
		
		System.out.println("Test----->check title");	
	}
	
	@Test
	public void GoogleSearch() {
		
		System.out.println("Test----->Search");	
	}
	
	
	@Test
	public void GoogleSendMail() {
		
		System.out.println("Test----->Send mail");	
	}
	
	
	//Post Condition will be @After
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod----->Logout from App");
	
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("AfterClass----->delete all cookies");
	}
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("AfterTest----->CLose the browser");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("AfterSuite----->Generates Reports");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
