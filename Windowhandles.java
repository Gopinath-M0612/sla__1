package sla.course;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	
	public static void main(String[] args) {
		
		
//		Launch the above website.
//
//		Click the “Click Here” link — it opens a new tab/window.
//
//		Switch to the new window and verify the title or text.
//
//		Close the new window and switch back to the main window.
//
//		Print titles of both windows.
		
		
		try {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/windows");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//*[text()='Click Here']")).click();
			String windowHandle = driver.getWindowHandle();
			
			List<String> text = new ArrayList<String>();
			List<String> url = new ArrayList<String>();
			
			for (String string : driver.getWindowHandles()) {
				String currentUrl = driver.switchTo().window(string).getCurrentUrl();
				url.add(currentUrl);
			}
			
			for (String string : driver.getWindowHandles()) {
				
				String title = driver.switchTo().window(string).getTitle();
				text.add(title);
				if (title.equals("New Window")) {
					driver.close();
				}
				driver.switchTo().window(windowHandle);
				
				
			}
			
			for (String string : url) {
					System.out.println(string);
				}
			
			for (String string : text) {
				System.out.println(string);
			}
				//System.out.println(string);
			
			
			driver.quit();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
