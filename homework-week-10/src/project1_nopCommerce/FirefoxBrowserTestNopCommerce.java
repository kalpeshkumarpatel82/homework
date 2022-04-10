package project1_nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTestNopCommerce {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        // Setting up Mozilla Firefox
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("Title of the Given URL : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("Given URL : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("Page Source : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("admin@email.com");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        // Close the browser
        driver.close();
    }
}