package session2Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
	
	public static void main(String[] args) {

		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Step 2: Load URL
		driver.get("https://demoqa.com/browser-windows");

		// Step 3: Maximize window
		driver.manage().window().maximize();
		
		// Step 4: Get current page title and URL and print it
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Step 5: Click New Tab button
		driver.findElementByXPath("//button[@id='tabButton']").click();
		
		Set<String> windows = driver.getWindowHandles();

		for (String eachwindow : windows) {
			driver.switchTo().window(eachwindow);
		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();
		
		// Step 6: Switch back to parent window and print
		System.out.println("Switch back to parent page");

		windows = driver.getWindowHandles();
		for (String eachwindow : windows) {
			driver.switchTo().window(eachwindow);
		}
		
		// Step 7: Get current page title and URL and print again
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Step 8: Close browser and driver instance
		driver.close();


	}


}
