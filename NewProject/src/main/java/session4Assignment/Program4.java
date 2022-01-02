package session4Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program4 {
	
	//This Class is implements TestNG Grouping and Dependency
	
		@Test(groups = "smoke")
		public void m1() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m1");
		}

		@Test(groups = "smoke")
		public void m2() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m2");
		}

		@Test(groups = "sanity", dependsOnGroups = "smoke")
		public void m3() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m3");
		}

		@Test(groups = "sanity", dependsOnGroups = "smoke")
		public void m4() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m4");
		}

		@Test(groups = "regression", dependsOnGroups = "sanity")
		public void m5() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m5");
		}

		@Test(groups = "regression", dependsOnGroups = "sanity")
		public void m6() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			driver.close();
			driver.quit();
			System.out.println("m6");
		}

}
