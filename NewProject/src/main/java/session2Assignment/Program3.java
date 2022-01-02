package session2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	
public static void main(String[] args) {
		
		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Step 2: Load URL
		driver.get("https://demoqa.com/alerts");

		// Step 3: Maximize window
		driver.manage().window().maximize();
		
		// Step 4: Click Button to switch alert and accept it
		driver.findElementByXPath("//button[@id='alertButton']").click();
		driver.switchTo().alert().accept();
		System.out.println("Accepted");
		
		// Step 5: Click Button to switch alert and dismiss it
		driver.findElementByXPath("//button[@id='confirmButton']").click();
		driver.switchTo().alert().dismiss();
		System.out.println("Dismissed");
		
		// Step 6: Click Button to switch alert and enter name and accept it
		driver.findElementByXPath("//button[@id='promtButton']").click();
		driver.switchTo().alert().sendKeys("Mithra");
		driver.switchTo().alert().accept();
		System.out.println("Enter name and accepted");
		
		// Step 7: Close browser and driver instance
		driver.close();
		
	}


}
