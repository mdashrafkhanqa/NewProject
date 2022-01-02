package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Load URL
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(3000);
		
		// Step 3: Enter username
		driver.findElementById("username").sendKeys("test");
		Thread.sleep(3000);
		
		// Step 4: Enter password
		driver.findElementById("password").sendKeys("test");
		Thread.sleep(3000);
		
		// Step 5: Click Signin button
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(3000);
		
		//Step 6: Close the browser
		driver.close();
		System.out.println("Success");


	}


}
