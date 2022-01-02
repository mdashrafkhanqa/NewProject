package sessionAUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
public static void main(String[] args) throws InterruptedException {			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		WebElement ele = driver.findElementByXPath("//button[contains(text(),'Double-Click Me To See Alert')]");			
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(ele).build().perform();
		Thread.sleep(3000);			
		driver.switchTo().alert().accept();
		
		System.out.println("success");
		
		driver.close();
		
	}


}
