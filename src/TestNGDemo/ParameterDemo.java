package TestNGDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	
	WebDriver driver;
	
	
	
	
	@Test
	@Parameters({"browser","emailID","environment"})
	public void gmailTest(String browser,String emailID,String environment) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			driver =new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"/chromedriver");
			driver =new FirefoxDriver();
		}else {
			System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+"/chromedriver");
			driver =new InternetExplorerDriver();
		}
		
		driver.get(environment);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()[normalize-space() = 'Sign in']])[2]")).click();
		
		
		String parentWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String windowHandle : handles) {
			String title = driver.switchTo().window(windowHandle).getTitle();
			if (!windowHandle.equals(parentWindow) && title.equalsIgnoreCase("Gmail")) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).clear();
				driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys(emailID);
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
		
				
				
		
	}
		}
		driver.switchTo().defaultContent();
		
		
	}
}
