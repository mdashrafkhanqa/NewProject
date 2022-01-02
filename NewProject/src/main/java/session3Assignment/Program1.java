package session3Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	
public static void main(String[] args) {
		
		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/* Here setProperty is an example of Method Overloading, same method name 
		 * but using different parameter of key and value */
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		/* Here implicitlyWait is an example of Method Overloading in Selenium webdriver 
		 * because same method name but using different parameter of time and unit.*/
		
		// Step 2: Load URL
		driver.get("https://demoqa.com/radio-button");
		/* Here get method also is an example of Method Overloading in Selenim webdriver, 
		 * by this same method we can load different parameter of url */
		
		// Step 3: Maximize window
		driver.manage().window().maximize();

		// Step 4: Close browser and driver instance
		driver.close();

	}


}
