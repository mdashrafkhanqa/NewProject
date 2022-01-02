package session4Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3 {
	
	/* This class is implemented by Invocation Count, Threadpool Size, 
	   Invocation Timeouts and Timeout Attributes */

	@Test(invocationCount = 3)
	public void invocationCount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("invocationCount");
	}

	@Test(invocationCount = 3, threadPoolSize = 3)
	public void invocationCountThreadpool() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("invocationCountThreadpool");
	}

	@Test(invocationCount = 2, invocationTimeOut = 60000)
	public void invocationCountTimeout() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("invocationCountTimeout");
	}

	@Test(invocationCount = 2, timeOut = 60000)
	public void invocationCountTimeouts() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("invocationCountTimeouts");
	}


}
