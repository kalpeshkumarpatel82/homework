package project2_OrangeHRMLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserOrangeHRM {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Setting up EDGE Browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Open Given URL
        driver.get(baseUrl);

        // Get title of the given URL
        System.out.println("The tile fo the page is :" + driver.getTitle());

        // Get Current URL of given URL
        System.out.println("The page souce is : " + driver.getCurrentUrl());

        // Get Page source of given URL
        System.out.println("The Page source " + driver.getPageSource());

        // Enter email in Email field
        WebElement emailField = driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin");

        // Enter Password in Password filed
        WebElement passfield = driver.findElement(By.name("txtPassword"));
        passfield.sendKeys("Admin123");

        // Close the browser
        driver.close();
    }
}