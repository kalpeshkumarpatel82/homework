package project5_utimateQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserUltimateQA {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        // Setting up EDGE Browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The title of the page is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The page source is : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("emailaddress@no-domain.com");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Abcd1234");

        // Close the browser
        driver.close();
    }
}