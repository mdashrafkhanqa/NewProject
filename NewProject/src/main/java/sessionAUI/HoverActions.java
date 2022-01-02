package sessionAUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverActions {
	
public static void main(String[] args) throws InterruptedException {			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElementByXPath("//span[contains(text(),'Account & Lists')]");			
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ele).build().perform();
		Thread.sleep(3000);			
		
		/*
		 * WebElement flag =
		 * driver.findElementByXPath("//span[@class='icp-nav-flag icp-nav-flag-us']");
		 * 
		 * builder.moveToElement(flag).build().perform(); Thread.sleep(3000);
		 */
		System.out.println("success");	
		
}


}
