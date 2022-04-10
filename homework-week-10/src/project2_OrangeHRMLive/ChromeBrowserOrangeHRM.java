package project2_OrangeHRMLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserOrangeHRM {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Setting up Chrome Browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The tile of the given URL is : " + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("Source of the given URL is : " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin");

        // Enter Password in Password filed
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");

        // Close the browser
        driver.close();

    }

}
