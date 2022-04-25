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

    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        // Finding a sign in link and clicking on it
        clickOnElement(By.linkText("Sign In"));

        // Searching a specific text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome Back!')]"));

        // required for validation
        String expectedMessage = "Welcome Back!";

        // Validating a test
        Assert.assertEquals("User is not on Sign In Page", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        // Finding a sign in link and clicking on it
        clickOnElement(By.linkText("Sign In"));

        // Finding an email field and passing a value
        sendTextToElement(By.name("user[email]"), "test");

        // Finding a password field and passing a value
        sendTextToElement(By.name("user[password]"), "test123");


        // finding a login button and clicking on it
        clickOnElement(By.xpath("//div/input[@value='Sign in']"));

        // Searching a specif text
        String actualMessage = getTextFromElement(By.xpath("//li[contains(text(),'Invalid email or password.')]"));

        // Required for a validation
        String expectedMessage = "Invalid email or password.";

        // validation of a test
        Assert.assertEquals("Test Failed ", expectedMessage, actualMessage);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
