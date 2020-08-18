package TestNGDemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	
	@Test(dataProvider= "WordPressLogin")
	public void LoginToApplication(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		 driver =new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		assertEquals(driver.getTitle(), "Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress", "login to Appliation");
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "WordPressLogin")
	public Object[][] dataToPass() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin";
		data[0][1]= "admin123";
		
		data[1][0] = "admin";
		data[1][1]= "demo123";
		
		data[2][0] = "admin123";
		data[2][1]= "demo1234";
		
		data[1][0] = "admin";
		data[1][1]= "demo123";
		
		data[2][0] = "admin123";
		data[2][1]= "demo1234";
		
		data[1][0] = "admin";
		data[1][1]= "demo123";
		
		data[2][0] = "admin123";
		data[2][1]= "demo1234";
		
		return data;
		
	}
	
	
}
