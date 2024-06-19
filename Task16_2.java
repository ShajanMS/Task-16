package guvSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16_2 {

	public static void main(String[] args) {

		// Set the path to the ChromeDriver executable

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		// Initialize a new instance of the ChromeDriver

		WebDriver driver = new ChromeDriver();

		try {

			// Navigate to the Demoblaze website

			driver.get("https://www.demoblaze.com/");

			// Maximize the browser window

			driver.manage().window().maximize();

			// Get the title of the current page

			String pageTitle = driver.getTitle();
			
			System.out.println("The Page title is : " + pageTitle);
			
			// Verify the title of the page
			
            if ("STORE".equals(pageTitle)) {
            	
            	 System.out.println("Page landed on correct website");
            	
            }
                
                else {
					
                	System.out.println("Page not landed on correct website");
				}

		} catch (Exception e) {

			e.printStackTrace();
		}
			
			finally {
				
				// Close the browser
				
				driver.quit();
			}
		}

	}