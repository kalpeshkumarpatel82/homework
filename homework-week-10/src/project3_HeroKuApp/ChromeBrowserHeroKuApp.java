package project3_HeroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserHeroKuApp {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Setting up Chrome Browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The title of the given URL is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The Current Url is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The page source is " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailFiled = driver.findElement(By.name("username"));
        emailFiled.sendKeys("tomsmith");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Close the browser
        driver.close();
    }
}
