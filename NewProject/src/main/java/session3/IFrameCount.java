package session3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameCount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.switchTo().defaultContent();

		List<WebElement> framelist1 = driver.findElementsByTagName("frame");
		Thread.sleep(3000);
		int size1 = framelist1.size();
		System.out.println("Parent frame size is " + size1);
		driver.switchTo().frame("frame-top");
		List<WebElement> framelist2 = driver.findElementsByTagName("frame");
		Thread.sleep(3000);
		int size2 = framelist2.size();
		System.out.println("Nested frame size is " + size2);
		driver.close();
		driver.quit();

	}

}
