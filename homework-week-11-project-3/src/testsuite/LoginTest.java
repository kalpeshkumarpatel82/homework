package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // Finding the username field and passing the value
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("tomsmith");

        // Finding the password field and passing the value
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton.click();

        // Searching for a specific text
        WebElement actualMessageText = driver.findElement(By.xpath("//div[@class='example' and contains(.,' Secure Area')]"));
        String actualMessage = actualMessageText.getText();
        //System.out.println(actualMessage); -- for debug purpose


        // Required for validation
        String expectedMessage = "Secure Area\nWelcome to the Secure Area. When you are done click logout below.\nLogout";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage,actualMessage);

    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        // Finding the username field and passing the value
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("tomsmith1");

        // Finding the password field and passing the value
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton.click();

        // Searching for a specific text
        WebElement actualMessageText = driver.findElement(By.xpath("//div[@id='flash' and contains(.,'Your username is invalid!')]"));
        String actualMessage = actualMessageText.getText();
        //System.out.println(actualMessage); -- for debug purpose

        // Required for validation
        String expectedMessage = "Your username is invalid!\n×";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage,actualMessage);

    }

    @Test
    public void verifyThePasswordErrorMessage(){

        // Finding the username field and passing the value
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("tomsmith");

        // Finding the password field and passing the value
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword");

        // Finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginButton.click();

        // Searching for a specific text
        WebElement actualMessageText = driver.findElement(By.xpath("//div[@id='flash' and contains(.,'Your password is invalid!')]"));
        String actualMessage = actualMessageText.getText();
        //System.out.println(actualMessage); -- for debug purpose

        // Required for validation
        String expectedMessage = "Your password is invalid!\n×";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage,actualMessage);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
