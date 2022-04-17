package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValid(){

        //Finding username field and passing a value
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Finding password field and passing a value
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //finding login button and clicking on it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Finding if actual text in present or not
        WebElement actualMessageText = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        String actualMessage = actualMessageText.getText();

        //Required for validation
        String expectedMessage = "PRODUCTS";

        //Validating the test
        Assert.assertEquals("User not logged in", expectedMessage,actualMessage);

    }


    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Finding username field and passing a value
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        //Finding password field and passing a value
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //finding login button and clicking on it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Finding if actual text in present or not
        //WebElement actualMessageText = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        int actualCountedItems = driver.findElements(By.xpath("//div[@class='inventory_item']")).size();
        // System.out.println(actualCountedItems); -- for debug purpose

        //Required for validation
        int expectedItems = 6;

        // validating a test
        Assert.assertEquals("User not logged in", expectedItems,actualCountedItems);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
