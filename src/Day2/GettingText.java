package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GettingText {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service="
				+ "mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		 String actualText = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		
		 System.out.println(actualText);
		 
		 String expectedText = "Enter an email or phone number";
		 
		 
		if (actualText.equals(expectedText)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		
		
	}

}
