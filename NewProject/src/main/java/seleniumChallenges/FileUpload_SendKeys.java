package seleniumChallenges;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_SendKeys {
	
	 public static void main(String[] args) throws IOException, InterruptedException {
		   
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize(); 
		   driver.get("https://www.monsterindia.com/seeker/registration"); 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\tanga\\OneDrive\\Desktop\\fileupload.text");
		   //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		   Thread.sleep(3000);
		   driver.close();
		   
		   }

}
