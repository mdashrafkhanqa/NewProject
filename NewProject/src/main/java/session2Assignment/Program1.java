package session2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	
	public static void main(String[] args) throws InterruptedException {

		// Step 1: Opening a browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Step2: Load URL
		driver.get("https://www.simplesite.com/pages/service-login.aspx");

		// Step3: Maximize window
		driver.manage().window().maximize();
		
		// Step4: Get page title
		String Title = driver.getTitle();

		// Step5: Get current URL
		String URL = driver.getCurrentUrl();

		// Step6: Get page source
		String Pagesource = driver.getPageSource();
		
		// Step7: Get Attribute
		WebElement element = driver.findElementById("loginBox_username");
		String Attribute = element.getAttribute("id");
		
		// Step8: Get CSS value
		WebElement element1 = driver.findElementByXPath("//input[@id='loginBox_username']");
		String CSS = element1.getCssValue("style");
		
		// Step9: Get text
		WebElement login = driver.findElementByXPath("//span[@class='subpage-hero-title-strong']");
		String text = login.getText();
		
		// Step10: Get location
		Point location = login.getLocation();
		
		// Step11: Get Size
		Dimension size = login.getSize();
		
		// Step12: Get tag name
		String tagname = login.getTagName();
		
		// Step13: Print all outputs

		System.out.println("Title is :" + Title);
		System.out.println("URL is :" + URL);
		System.out.println("Page source is :" + Pagesource);
		System.out.println("Attribute is :" + Attribute);
		System.out.println("CSS is :" + CSS);
		System.out.println("Text is :" + text);
		System.out.println("Location is :" + location);
		System.out.println("Size is :" + size);
		System.out.println("Tag Name is :" + tagname);

		// Step14: Close browser and driver instance
		driver.close();


	}


}
