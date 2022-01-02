package session15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement table = driver.findElementByTagName("table");
		
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		System.out.println("Row count is "+tRow.size());
		
		List<WebElement> tData = tRow.get(0).findElements(By.tagName("td"));
		
		System.out.println("Column count is "+tData.size());
		
		//System.out.println(tData.get(0).getText());
		
		
		for (int i=0;i<tRow.size();i++) {
			List<WebElement> colList= tRow.get(i).findElements(By.tagName("td"));
			for(int j=0;j<colList.size();j++) {
				System.out.println(colList.get(j).getText());
			}
		}
		driver.quit();
			
	}


}
