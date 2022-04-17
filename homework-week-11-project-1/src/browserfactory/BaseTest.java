package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void OpenBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        driver = new ChromeDriver();

        //Launch the URL.
        driver.get(baseUrl);
        //Maximizing the windows
        driver.manage().window().maximize();
        //Waiting for Implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){
        // Quiting the Browser
        driver.quit();
    }


}
