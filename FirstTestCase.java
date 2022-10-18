package DemoMaven.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slpl-1203\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
//Launch Google web page		
		driver.navigate().to("https://www.google.com");
//Capture title
		String title = driver.getTitle();
				
		System.out.println("Page Title :" + title);

//Capture URL of web page		
		        
		System.out.println("URL : " + driver.getCurrentUrl());
		
		driver.manage().window().fullscreen();
				
//Driver Close		
		driver.close();
		
	}

}
