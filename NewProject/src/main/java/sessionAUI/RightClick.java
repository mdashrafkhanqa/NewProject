package sessionAUI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		  driver.manage().window().maximize();		  		 
		  Actions action = new Actions(driver);		  
		  action.contextClick(driver.findElementByXPath("//span[contains(text(),'right click me')]")).build().perform(); 
		  Thread.sleep(3000); 
		  driver.close();

	}


}
