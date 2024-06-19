package guvSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task16 {

	public static void main(String[] args) {

		// Set the path to the GeckoDriver executable

		System.setProperty("webdriver.firefox.marionett",
				"D:\\Selenium\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

		// Set the path to the GeckoDriver executable

		WebDriver driver = new FirefoxDriver();

		try {

			// Maximize the browser window

			driver.manage().window().maximize();

			// Navigate to Google

			driver.get("https://www.google.com/");

			// Print the URL of the current page

			System.out.println("Current URL: " + driver.getCurrentUrl());

			// Reload the page

			driver.navigate().refresh();

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			// Close the browser

			driver.quit();
		}

	}

}
