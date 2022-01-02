package sessionAUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		WebElement element1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement element2 = driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		WebElement element3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement element4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		WebElement element5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement element6 = driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		WebElement element7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");

		Actions builder = new Actions(driver);

		builder.clickAndHold(element1).release(element7).build().perform();

		// Right click without webelement
		builder.contextClick().build().perform();

		builder.keyDown(Keys.CONTROL).click(element1).click(element3).click(element5).click(element7)
			   .keyUp(Keys.CONTROL).build().perform();

	}


}
