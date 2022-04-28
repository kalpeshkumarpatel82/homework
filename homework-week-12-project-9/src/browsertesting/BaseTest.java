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

    public static void openBrowser(String baseUrl){
        // Setting up Chrome Options
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notification");
        option.addArguments("--incognito");
        // Setting chrome Driver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver(option);
        //Open a URL
        driver.get(baseUrl);

        // Maximise windows
        driver.manage().window().maximize();

        // implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
        driver.quit();
    }

}
