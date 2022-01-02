package session3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompileTimeException {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		//Handling exception using super class Exception
				//	public void exception() throws Exception      {
				
				// Step1: Launch chrome

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				ChromeDriver driver = new ChromeDriver();
				// Step2: Load URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

				// Step3: Window maximize
				driver.manage().window().maximize();
				
				Thread.sleep(3000);

				// Step4: Take screen shot

				// Take screen shot and save it to file name src
				File src = driver.getScreenshotAs(OutputType.FILE);

				// create new file dest in the project folder to copy the screen shot taken
				File destFile = new File("./reports/images/snap.jpg");

				// Copy file from src to dest file created inside project folder
				FileUtils.copyFile(src, destFile);

				// Step5: Close browser
				driver.close();
				driver.quit();	
	}


}
