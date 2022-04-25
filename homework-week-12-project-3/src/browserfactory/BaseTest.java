package browserfactory;
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

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(options);

        //Launch the URL.
        driver.get(baseUrl);
        //Maximizing the windows
        driver.manage().window().maximize();
        //Waiting for Implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser() {
        // Quiting the Browser
        driver.quit();
    }


}
