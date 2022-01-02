package session2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {
	
	public static void main(String[] args) {
		// Step1: Launch Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Step2: Load URL
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		// Step3: Maximize window
		driver.manage().window().maximize();

		// Step4: Check whether web element is displayed
		WebElement element = driver.findElementByTagName("h3");
		Boolean Display = element.isDisplayed();

		// Step5: Check whether the radio button is selected or not
		WebElement radiobutton1 = driver.findElementByXPath("(//input[@type='checkbox'])[1]");
		Boolean Selected1 = radiobutton1.isSelected();

		WebElement radiobutton2 = driver.findElementByXPath("(//input[@type='checkbox'])[2]");
		Boolean Selected2 = radiobutton2.isSelected();

		// Step6: Check whether web element is enabled
		driver.get("https://demoqa.com/radio-button");
		WebElement element2 = driver.findElementByXPath("//input[@id='noRadio']");
		Boolean Enable = element2.isEnabled();

		// Step7: Print all outputs
		System.out.println("Display is :" + Display);
		System.out.println("Selected1 is :" + Selected1);
		System.out.println("Selected2 is :" + Selected2);
		System.out.println("Enable is :" + Enable);

		// Step8: Close browser and driver instance
		driver.close();
	}


}
