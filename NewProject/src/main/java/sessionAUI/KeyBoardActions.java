package sessionAUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));

		WebElement item1 = driver.findElementByXPath("(//ol[@id='selectable']//li)[1]");
		WebElement item7 = driver.findElementByXPath("(//ol[@id='selectable']//li)[7]");

		WebElement item3 = driver.findElementByXPath("(//ol[@id='selectable']//li)[3]");
		WebElement item5 = driver.findElementByXPath("(//ol[@id='selectable']//li)[5]");

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).build()
				.perform();
		Thread.sleep(3000);

	}


}
