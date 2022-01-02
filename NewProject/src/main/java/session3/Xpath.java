package session3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/forms");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//span[contains(text(),'Practice Form')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[starts-with(@id,'first')]").sendKeys("mithra");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[contains(@id,'last')]").sendKeys("G");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[contains(@placeholder,'name')]").sendKeys("ABC");

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}


}
