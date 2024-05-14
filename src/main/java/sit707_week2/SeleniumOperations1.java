package sit707_week2;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations1 {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gruhi\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new FirefoxDriver();
		
			
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		
		WebElement username = driver.findElement(By.id("new_username"));
		System.out.println("Found element: " + username);
		username.sendKeys("gruhi");
		
		
		WebElement Email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + Email);
		Email.sendKeys("gruhipatel@gmail.com.com");
				
	
		WebElement password = driver.findElement(By.id("new_password"));
		System.out.println("Found element: " + password);
		password.sendKeys("Qazwsx@123");
		
		
	
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
