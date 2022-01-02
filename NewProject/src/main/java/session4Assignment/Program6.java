package session4Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program6 {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("Method m1 passed successfully");
	}

	@Test
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("Method m2 passed successfully");
	}

	@Test
	public void m3() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("Method m3 passed successfully");
	}

	@Test
	public void m4() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("Method m4 passed successfully");
	}

	@Test
	public void m5() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		System.out.println("Method m5 passed successfully");
	}


}
