package session3Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program6 {
	
	@Test
	public static void main() throws InterruptedException {

		// Step 1: Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Synchronization and Maximize Browser
		driver.manage().window().maximize();

		// Using implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 3: Loading URL
		driver.get("https://demoqa.com/text-box");

		// Step 4: Locating element Full Name by Xpath (basic)
		driver.findElementByXPath("//label[@id='userName-label']").isDisplayed();
		Thread.sleep(2000);

		// Step 5: Locating element Email by Xpath (contains and partial attribute value)
		driver.findElementByXPath("//label[contains(@id,'Email')]").isDisplayed();
		Thread.sleep(2000);

		// Step 6: Locating element Current Address by Xpath (starts-with and full value)
		driver.findElementByXPath("//label[starts-with(@id,'currentAddress')]").isDisplayed();
		Thread.sleep(2000);

		// Step 6: Locating element Permanent Address by Xpath (starts-with and partial value)
		driver.findElementByXPath("//label[starts-with(@id,'permanent')]").isDisplayed();
		Thread.sleep(2000);

		// Step 7: Close browser and driver instance
		driver.close();
		driver.quit();
	}


}
