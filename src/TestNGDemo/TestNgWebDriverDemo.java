package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgWebDriverDemo {

	
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"/chromedriver");
		 driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 0)
	public void getTitle() {
		 String title = driver.getTitle();
		System.out.println("Title is : " + title);
	}
	
	
	
	@Test(priority = 2)
	public void checkLogoIsDisplayed() {
		
		 boolean logo = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println("Google Image is found in App : " + logo);
	}
	
	
	
	@Test(priority = 1)
	public void checkForGmailLink() {
		 boolean gmailLink = driver.findElement(By.xpath("//a[text()='mail']")).isDisplayed();
		 
		 System.out.println("Gmail link is found in app : " + gmailLink);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
