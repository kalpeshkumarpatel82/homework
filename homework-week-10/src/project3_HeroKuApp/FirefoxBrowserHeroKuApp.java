package project3_HeroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserHeroKuApp {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Setting up Mozilla Firefox
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The title of the Page is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The Current Url is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The Page Source is : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Close the browser
        driver.close();
    }
}