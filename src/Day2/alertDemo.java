package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		
		Thread.sleep(30000);
		
		  String alertText = driver.switchTo().alert().getText();
		
		  System.out.println(alertText);
		
		  Thread.sleep(30000);
		  
		  driver.switchTo().alert().accept();
		  
		  
		  driver.switchTo().alert().dismiss();
		  driver.quit();
	}

}
