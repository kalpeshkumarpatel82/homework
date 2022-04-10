package project4_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserSauceDemo {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        // Setting up Mozilla Firefox
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The title of the page is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The current url is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The page source is : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("abc123@nodomain.com");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("nopassword");

        // Close the browser
        driver.close();
    }
}