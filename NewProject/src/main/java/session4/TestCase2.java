package session4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends GenericWrappers {
	
	@Test 
	public void testCase2() throws InterruptedException {
		//Step 1: Launch the browser
		invokeApp("Chrome", "https://demoqa.com/login");
		
		//Step 2: Enter the username
		enterById("userName", "test");
		
		//Step 3: Enter the password
		enterById("password", "Dheeshi3101*");
		
		//Step 4: Click Login
		clickById("login");
		
		//Step 5: Scroll to Book store element
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		scrollToElement(element);
		Thread.sleep(2000);
		
		//Step 6: Click Book Store
		clickByXpath("//span[contains(text(),'Book Store')]");
		
		//Step 7: Enter search text
		enterByXpath("//input[@id='searchBox']", "Learning JavaScript Design Patterns");
		
		//Step 8: Click search result
		clickByXpath("//a[contains(text(),'Learning JavaScript Design Patterns')]");
		
		//Step 9: Get book title and print
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		
		//Step 10: Click logout
		clickByXpath("//button[@id='submit']");
		
		//Step 11: Close browser and driver instance
		closeBrowser();
		closeAllBrowsers();
	}


}
