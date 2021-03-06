package project2_OrangeHRMLive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultipleBrowsersSelectOrangeHRM {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your WebBrowser Choice [1=Chrome, 2=Firefox, 3=Edge] : ");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println("You have selected, Google Chrome!! \nSelenium Web driver for Google Chrome is set!!");
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case 2:
                System.out.println("You have selected, Mozilla Firefox!!\nSelenium Web driver for Mozilla Firefox is set!!");
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case 3:
                System.out.println("You have selected, Microsoft EDGE!!\nSelenium Web driver for Microsoft EDGE is set!!");
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Wrong Choice of the Web Browser!");
        }
        driver.get(baseUrl);

    }
}
