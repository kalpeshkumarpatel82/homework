package project1_nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTestNopCommerce {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        // Setting up EDGE Browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

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
        emailField.sendKeys("myemail@mydomain.com");

        // Enter Password in Password filed
        WebElement passwordFiled = driver.findElement(By.name("Password"));
        passwordFiled.sendKeys("pass1234");

        // Close the browser
        driver.close();
    }
}