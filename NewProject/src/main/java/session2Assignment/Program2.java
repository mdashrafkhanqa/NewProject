package session2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	
	public static void main(String[] args) {

		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Step 2: Load URL
		driver.get("https://demoqa.com/radio-button");

		// Step 3: Maximize window
		driver.manage().window().maximize();
		
		// Step 4: Check whether web element is displayed
		WebElement element = driver.findElementByClassName("mb-3");
		Boolean Display = element.isDisplayed();
		
		// Step 5: Check whether web element is enabled
		WebElement element2 = driver.findElementByXPath("//input[@id='noRadio']");
		Boolean Enable = element2.isEnabled();
		
		// Step 6: Check whether the radio button is selected
		WebElement radiobutton = driver.findElementByXPath("//label[@for='yesRadio']");
		Boolean Selected = radiobutton.isSelected();
		
		// Step7: Print all outputs
		System.out.println("Display is :" + Display);
		System.out.println("Enable is :" + Enable);
		System.out.println("Selected is :" + Selected);
		
		// Step 8: Close browser and driver instance
		driver.close();

	}


}
