package session3Assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program5 {
	
	public static ChromeDriver driver;

	@Test
	public static void exceptionHandling() throws WebDriverException, IOException {

		// Step 1: Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		// Step 2: Synchronization and Maximize Browser
		driver.manage().window().maximize();

		// Using implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 3: Loading URL
		driver.get("https://www.simplesite.com/pages/service-login.aspx");

		// Step 4: Exception handling Try, Catch and Finally block and take screenshot
		try {

			driver.findElementByXPath("//input[@id='loginBox_username']").sendKeys("test");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			takeScreenShot();
		}

		// Step 5: Exception handling Try, Catch and Finally block and take screenshot
		try {

			driver.findElementByXPath("//input[@id='loginBox_password']").sendKeys("test");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			takeScreenShot();
		}

		// Step 6: Exception handling Try, Catch and Finally block and take screenshot
		try {

			driver.findElementByXPath("//a[@id='loginBox_loginbtn']").click();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			takeScreenShot();
		}

		// Step 7: Close browser and driver instance
		driver.close();
		driver.quit();
	}

	/* Creating reusable method to take screenshot with random file name generator
	 * and copy file using parameters srcFile and destFile by FileUtils */
	public static long takeScreenShot() throws WebDriverException, IOException {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}


}
