package SeleniumOverview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
				
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']")); 
		 
		 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 
		 
		 Select daySelect = new Select(day);
		
		 WebElement SelectDropDown = daySelect.getFirstSelectedOption();
		 
		 
		 System.out.println(SelectDropDown.getText());
		 
		 daySelect.selectByIndex(10);
		  Thread.sleep(100);
		  WebElement SelectDropDown1 = daySelect.getFirstSelectedOption();
		  System.out.println(SelectDropDown1.getText());
		 
		 Select monthSelect = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		// WebElement SelectDropDown = daySelect.getFirstSelectedOption();
		 monthSelect.selectByValue("4");
		 
		 Select yearSelect = new Select(year);
		 
		 yearSelect.selectByVisibleText("1970");
		 
		 
		
		 
		// yearSelect.
		 
		//driver.close();

	}

}
