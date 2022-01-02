package session5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TestCase2";
		testDescription = "Book search for Learning JavaScript Design Patterns";
		browserName = "chrome";
		dataSheetName = "TC002";
		category = "Smoke";
		authors = "Ashraf";
	}

	
	@Test(dataProvider = "fetchData")
	public void testCase2(String UN, String PW, String searchText) throws InterruptedException {
		invokeApp("Chrome");
		enterById("userName", UN);
		enterById("password", PW);
		clickById("login");
		Thread.sleep(2000);
		WebElement element = driver.findElementByXPath("//span[contains(text(),'Book Store')]");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Book Store')]");
		enterByXpath("//input[@id='searchBox']", searchText);
		clickByXpath("//a[contains(text(),'Learning JavaScript Design Patterns')]");
		String bookTitle = getTextByXpath("//div[@id='title-wrapper']//div[2]//label");
		System.out.println("Book title is " + bookTitle);
		clickByXpath("//button[@id='submit']");
		closeBrowser();
	}


}
