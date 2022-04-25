package testsuite;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Finding the username field and passing the value
        sendTextToElement(By.name("username"),"tomsmith");

        // Finding the password field and passing the value
        sendTextToElement(By.name("password"),"SuperSecretPassword!");

        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));

        // Searching for a specific text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='example' and contains(.,' Secure Area')]"));

        // Required for validation
        String expectedMessage = "Secure Area\nWelcome to the Secure Area. When you are done click logout below.\nLogout";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        // Finding the username field and passing the value
        sendTextToElement(By.name("username"),"tomsmith1");

        // Finding the password field and passing the value
        sendTextToElement(By.name("password"),"SuperSecretPassword!");

        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));

        // Searching for a specific text
        String actualMessage = getTextFromElement(By.xpath("//div[@id='flash' and contains(.,'Your username is invalid!')]"));

        // Required for validation
        String expectedMessage = "Your username is invalid!\n×";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage, actualMessage);

    }

    @Test
    public void verifyThePasswordErrorMessage() {

        // Finding the username field and passing the value
        sendTextToElement(By.name("username"),"tomsmith");

        // Finding the password field and passing the value
        sendTextToElement(By.name("password"),"SuperSecretPassword");

        // Finding the login button and clicking on it
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));

        // Searching for a specific text
        String actualMessage =getTextFromElement(By.xpath("//div[@id='flash' and contains(.,'Your password is invalid!')]"));

        // Required for validation
        String expectedMessage = "Your password is invalid!\n×";

        // Validating actual message with expected message
        Assert.assertEquals("User is not logged in ", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
