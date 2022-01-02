package session1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCW {
	
	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Maximise the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Step 3: Load URL
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Thread.sleep(3000);
		
		// Step 4: Identify the DropDown
		WebElement dropdown = driver.findElementByXPath("//select[@id='dropdown']");
		Thread.sleep(3000);
		
		// Step 5: Creating object for Select class using dropdown WebElemnt
		Select option = new Select(dropdown);
		Thread.sleep(3000);
		
		// Step 6 - Way 1: using index
		option.selectByIndex(1);
		Thread.sleep(3000);
		
		// Step 6 - Way 2: using value
		option.selectByValue("1");
		Thread.sleep(3000);
		
		// Step 6 - Way 3: using visible text
		option.selectByVisibleText("Option 2");
		Thread.sleep(3000);
		
		// Step 7: Printing Success
		System.out.println("Success");
		
		// Step 8: Close the browser
		driver.close();
		
	}


}
