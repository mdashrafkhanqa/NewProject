package session2;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlartAndFrame {
	
	public static void main(String[] args) throws InterruptedException {
	    // 1. Launch chrome web browser
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

	    // 2. Synchronization and Maximize
	    driver.manage().window().maximize();

	    // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	    // Load URL
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

	    Thread.sleep(2000);
	    // To get inside particular frame
	    // driver.switchTo().frame("iframeResult");
	    // To find an element "Try button" inside the frame and click
	    driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
	    Thread.sleep(2000);
	    // Switch to alert and enter text and close
	    driver.switchTo().alert().sendKeys("Mithra");

	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);

	    // Get the text and store it in the string and check whether my name is present
	    // or not

	    String text = driver.findElementByXPath("//p[@id='demo']").getText();

	    /*
	     * WebElement element = driver.findElementByXPath("//p[@id='demo']"); String
	     * text = element.getText();
	     */

	    // To come out of the frame - to default web page/content
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);

	    if (text.contains("123")) {
	      System.out.println("The Text contains my name");
	      System.out.println(text);
	    } else {
	      System.out.println("The text does not contains my name");
	      System.out.println(text);
	    }
	    driver.close();
	  }


}
