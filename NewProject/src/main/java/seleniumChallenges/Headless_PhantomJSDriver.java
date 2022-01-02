package seleniumChallenges;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Headless_PhantomJSDriver {
	
	public static void main(String[] args) throws WebDriverException, IOException {
		//PhantomJS Driver Implementation - supports screenshots
		//In order to use PhantomJS with Selenium, one has to use GhostDriver. GhostDriver is a implementation of Webdriver Wire protocol in simple JS for PhantomJS.
		//Download link for phantomJS with GhostDriver: https://phantomjs.org/download.html
		  File file = new File("/Users/cb-mithra/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");				
          System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
          WebDriver driver = new PhantomJSDriver();	
          driver.get("http://www.google.com");         
          WebElement element = driver.findElement(By.name("q"));	
          element.sendKeys("Guru99");					
          element.submit();         			
          System.out.println("Page title is: " + driver.getTitle());	
  		  FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./reports/images/phantomjsscreenshot.jpg"));
          driver.quit();					
	}

}
