package project3_HeroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowerHeroKuApp {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Setting up EDGE Browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The Title of the Page is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The page Source is : " + driver.getPageSource());

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