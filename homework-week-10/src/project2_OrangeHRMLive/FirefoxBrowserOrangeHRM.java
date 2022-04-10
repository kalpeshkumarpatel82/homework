package project2_OrangeHRMLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserOrangeHRM {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Setting up Mozilla Firefox
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The title of the given URL is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The page source is : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("Admin123");

        // Close the browser
        driver.close();
    }
}