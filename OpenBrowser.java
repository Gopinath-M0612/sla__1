package sla.course;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenBrowser {
	
	

	
	public static void main(String[] args)  {
		
		try {
			
			
			  WebDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  //Opening the URL 
			  driver.get("https://academybugs.com/contact-us-form/");
			  
			  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			  
			  
			  for (WebElement webElement : allLinks) {
			  System.out.println(webElement.getText());
			  }
			  
			  for (int i = 0; i < allLinks.size(); i++) 
			  {
				  WebElement links = allLinks.get(i);
				  System.out.println((i+1)+ " : "+ links.getAttribute("href"));
			  }
				  
			 System.out.println("\nTotal number of links are "+allLinks.size());
			 
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
