package guvSele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task16_3 {

	public static void main(String[] args) {
		
		// Set the path to the ChromeDriver executable
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		// Initialize a new instance of the ChromeDriver
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			 // Maximize the browser window
			
			driver.manage().window().maximize();
			
			 // Navigate to Wikipedia
			
			driver.get("https://www.wikipedia.org");
			
			 // Locate the search input field and enter the query "Artificial Intelligence"
			
			WebElement AI = driver.findElement(By.id("searchInput"));
			
			AI.sendKeys(("Artifical Intelligence")+Keys.ENTER);
			
			// Wait until the search results page loads and the "History" link is visible
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			 WebElement History = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toc-History\"]/a/div/span[2]")));
			 
			// Click on the "History" section link
			 
			History.click();
			
			// Wait until the History section is loaded
			 
			WebElement historySection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("History")));
			
			// Print the title of the History section
			
			 System.out.println("Section Title: " + historySection.findElement(By.xpath("//*[@id=\"History\"]")).getText());
            
		} catch (Exception e) {
			
			   e.printStackTrace();
		} finally {
			
			// Close the browser
			
			driver.close();
		}
	}

}
