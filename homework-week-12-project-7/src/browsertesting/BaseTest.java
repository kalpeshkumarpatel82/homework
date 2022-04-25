package browsertesting;
/* 
 Created by Kalpesh Patel
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); //disable browser notification
        options.addArguments("--incognito"); //open browser in private windows
        // Setting up Google Chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver(options);

        // Opening a URL
        driver.get(baseUrl);

        // Maximizing the windows
        driver.manage().window().maximize();

        // setting up an implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public void closeBrowser() {
        driver.quit();
    }
}
