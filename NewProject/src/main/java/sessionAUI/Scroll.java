package sessionAUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	
public static void main(String[] args) throws InterruptedException {			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		Actions builder = new Actions(driver);
		
		builder.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);	
		
		builder.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(3000);	
		System.out.println("success");
		
		driver.close();
		
		
			
		
		
		
		
		
		
}


}
