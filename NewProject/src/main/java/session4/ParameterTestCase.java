package session4;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestCase extends GenericWrappers{
	
	@Parameters({"URL","Username","Password"})
	@Test
	public void testCase1(String url,String UN,String PW) throws InterruptedException {
		invokeApp("Chrome", url);
		enterById("userName", UN);
		enterById("password", PW);
		clickById("login");
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		scrollToElement(element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", "Git Pocket Guide");
		clickByXpath("//a[contains(text(),'Git Pocket Guide')]");
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		clickByXpath("//button[@id='submit']");
		closeBrowser();
		closeAllBrowsers();
	}


}
