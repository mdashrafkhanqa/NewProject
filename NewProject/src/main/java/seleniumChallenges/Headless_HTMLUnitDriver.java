package seleniumChallenges;

import java.awt.AWTException;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Headless_HTMLUnitDriver {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		/*
		 * --> Headless browser that is primarily used for GUI less automation. 
		 * --> It is highly recommended in case of overnight script execution, where human monitoring is
		 * not required as the execution is quick fast. 
		 * --> The objective of headless browser automation is slightly different as it’s a GUI less browser and its
		 * primary usage is to automate the test cases which falls under the category of
		 * smoke test/validation tests and not full-fledged regressive test automation.
		 * Below are 2 headless browsers 
		 * 1. HTMLUnitDriver 2. PhantomJS Driver
		 */
		

		//HTMLUnitDriver Implementation - Cannot take screenshots
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("https://www.linkedin.com/login");
		
		//Print title of the page
		System.out.println(driver.getTitle());

	}

}
