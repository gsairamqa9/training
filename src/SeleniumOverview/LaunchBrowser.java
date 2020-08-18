package SeleniumOverview;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.name("txtUsername")).sendKeys("admin");
//		
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		
//		driver.findElement(By.id("btnLogin")).click();
//		
//		driver.findElement(By.id("btnLogin")).getText();
		
		
		
		//xpath syntax
		//tagname[@Attributevalue = 'elementname']
		
		//text xpath syntax
		//tagname[text()='']
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		 String currentTitle = driver.getTitle();
		 
		 String actualTitle = "OrangeHRM1";
		 
		 if (currentTitle.equals(actualTitle)) {
			 System.out.println("Test is Passed");
		}else {
			System.out.println("Test is failed");
		}
		 
		 driver.findElement(By.xpath("//b[text()='Admin']")).click();
		 
		 driver.findElement(By.xpath("//input[@type='text' and @name='searchSystemUser[userName]']")).sendKeys("steven.edwards");
		
		 driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		
		
		
		
		
		
	}

}
