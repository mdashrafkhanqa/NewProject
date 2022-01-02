package session3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		
		// Step1: Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		// Step2: Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Step3: Window maximize
		driver.manage().window().maximize();

		// Step4: Take screen shot
		takeSnap();
		
		// Take screen shot and save it to file name source as src
		//File src = driver.getScreenshotAs(OutputType.FILE);

		// create new file destination as dest in the project folder to copy the screen shot taken
		//File dest = new File("./reports/images/snap.jpg");

		// Copy file from src to dest file created inside project folder
		//FileUtils.copyFile(src, destFile);
		

		// Step5: Close browser
		driver.close();
		driver.quit();

	}

	public static long takeSnap() throws WebDriverException, IOException {
		// random file name generator
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;

		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./reports/images/" + number + ".jpg"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return number;
	}


}
