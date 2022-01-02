package session2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	
	public static void main(String[] args) {

		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Step 2: Load URL
		driver.get("https://demoqa.com/frames");

		// Step 3: Maximize window
		driver.manage().window().maximize();
		
		// Step 4: Switch to frame and then get text and print
		WebElement iFrame = driver.findElementByXPath("//iframe[@id='frame1']");
		driver.switchTo().frame(iFrame);
		String text = driver.findElementByXPath("//h1[@id='sampleHeading']").getText();
		System.out.println(text);
		
		// Step 5: Switch back to main HTML page
		driver.switchTo().defaultContent();
		System.out.println("Successfully switch back to main HTML");
		
		// Step 6: Close browser and driver instance
		driver.close();

	}


}
