package Day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sairam");
		
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./ScreenShots/facebook.png"));
	
		driver.quit();

		
	}

}
