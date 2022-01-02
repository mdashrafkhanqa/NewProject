package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Step 1: Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Maximise the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Step 3: Load URL
		driver.get("http://demo.guru99.com/test/login.html");
		Thread.sleep(3000);
		
		// Step 4: Enter Email address
		driver.findElementById("email").sendKeys("mngr357182");
		Thread.sleep(3000);
		
		// Step 5: Enter password
		driver.findElementById("passwd").sendKeys("avaqaty");
		Thread.sleep(3000);
		
		// Step 6: Click Signin button
		driver.findElementByXPath("//*[@id='SubmitLogin']").click();
		Thread.sleep(3000);
		
		//Step 7: Close the browser
		driver.close();
		System.out.println("Success");

}


}
