package sessionAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitType {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/logosauce");
		driver.manage().window().maximize();

		FluentWait<ChromeDriver> wait = new FluentWait<ChromeDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/logosauce']//div//div)[2]")));

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElementByXPath("(//a[@href='/logosauce']//div//div)[2]")).build().perform();
		Thread.sleep(3000);
		driver.close();
	}


}
