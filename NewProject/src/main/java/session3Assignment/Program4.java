package session3Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	
public static void main(String[] args) throws InterruptedException {
		
		// Step 1: Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Synchronization and Maximize Browser
		driver.manage().window().maximize();
		
		// Using implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 3: Loading URL
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		// Step 4: Locate List of elements and put into framelist variable
		List<WebElement> framelist = driver.findElementsByTagName("iframe");
		
		// Step 5: Counting framelist using size method and put into size variable that is int data and print
		int size = framelist.size();
		System.out.println("Parent frame size is " + size);
		
		// Step 6: Close browser and driver instance
		driver.close();
		driver.quit();

	}


}
