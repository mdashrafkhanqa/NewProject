package session4Assignment;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program5 extends GenericWrappers{
	
	@Test
	@Parameters({"URL","UN","PW"})
	public void testCase3(String url, String username, String password) throws InterruptedException {
		//Step 1: Launch the browser
		invokeApp("Chrome", url);
		
		//Step 2: Enter the username
		enterById("userName", username);
		
		//Step 3: Enter the password
		enterById("password", password);
		
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
		enterByXpath("//input[@id='searchBox']", "Designing Evolvable Web APIs with ASP.NET");
		
		//Step 8: Click search result
		clickByXpath("//a[contains(text(),'Designing Evolvable Web APIs with ASP.NET')]");
		
		//Step 9: Get book title and print
		String bookTitle = getTextByXpath("//label[contains(text(),'Designing Evolvable Web APIs')]");
		System.out.println("Book title is " + bookTitle);
		
		//Step 10: Get Publisher and print
		String publisher = getTextByXpath("(//label[@id=\"userName-value\"])[6]");
		System.out.println("Book publisher is " + publisher);
		
		//Step 11: Scroll to Add To Your Collection
		Thread.sleep(2000);
		WebElement add = driver.findElementByXPath("//button[contains(text(),'Add')]");
		scrollToElement(add);
		Thread.sleep(2000);
		
		//Step 12: Click Add To Your Collection
		clickByXpath("//button[contains(text(),'Add')]");
		
		//Step 13: Click OK (Accept Alert)
		acceptAlert();
		
		//Step 14: Scroll to Profile
		Thread.sleep(2000);
		WebElement profile = driver.findElementByXPath("//span[contains(text(),'Profile')]");
		scrollToElement(profile);
		Thread.sleep(2000);
		
		//Step 15: Click Profile
		clickByXpath("//span[contains(text(),'Profile')]");
		
		//Step 16: Verify the book added to collection
		verifyTextByXpath("//a[contains(text(),'Designing Evolvable Web APIs with ASP.NET')]", "Designing Evolvable Web APIs with ASP.NET");
		
		//Step 17: Click logout
		clickByXpath("//button[@id='submit']");
		
		//Step 18: Close browser and driver instance
		closeBrowser();
		closeAllBrowsers();
	}


}
