package sla.course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPractice {
	
	public static void main(String[] args) {
		
		
		WebDriver driver;

		try {
			
			driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.id("submit")).click();
			
			WebElement element = driver.findElement(By.className("post-title"));
			
			if(element.isDisplayed()) {
				System.out.println(element.getText());
			}else
				System.out.println("No such text exsist");
			
			driver.quit();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
}
