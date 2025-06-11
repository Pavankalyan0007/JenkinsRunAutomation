package JenkinsDemoWithOutPlugins.JenkinsDemoWithOutPlugins;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	
	@Test
    public void googleTest() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open Google URL
        driver.get("https://www.google.com");

        // Maximize browser window
        driver.manage().window().maximize();
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("pavan");
        searchBar.sendKeys(Keys.RETURN);
        // Keep the browser open for a while
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        // Close browser
//        driver.quit();
    }
}
