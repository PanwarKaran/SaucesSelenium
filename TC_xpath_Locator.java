package DemoMaven.Test1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slpl-1203\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

//		ChromeOptions opt = new ChromeOptions();
//		opt.setExperimentalOption("debuggerAddress", "Localhost:6655");

//		Thread.sleep(2000);

//Launch Chrome
		WebDriver driver = new ChromeDriver();

//Web page
		driver.get("https://www.saucedemo.com");

//Full screen
		/* driver.manage().window().fullscreen(); */
		driver.manage().window().maximize();

//Locate user name
		driver.findElement(By.cssSelector("input[name=user-name]")).sendKeys("standard_user");
		Thread.sleep(2000);
//Locate password
		driver.findElement(By.cssSelector("input[name=p	assword]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
//Hit login button
		driver.findElement(By.cssSelector("input[name=login-button]")).click();
		Thread.sleep(2000);
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);

		/* Direct linked */
		driver.findElement(By.partialLinkText("Onesie")).click();
		Thread.sleep(2000);

		/* add to card */
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[name$=continue-shopping]")).click();
		Thread.sleep(2000);

		// Remove from card

		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		Thread.sleep(2000);

//Find elements from page
//		List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
//		System.out.println("Element size:" + elementList.size());

		driver.findElement(By.className("inventory_item_name")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);

		// add to cart bulk
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);

		// Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		
		

	}

}
