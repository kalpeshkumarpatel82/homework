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
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Finding the login Link and Clicking on Login Link
        clickOnElement(By.linkText("Log in"));

        // Searching the test element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // This is expected Message and taken from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Validating actual and exacted results
        Assert.assertEquals("Not Navigate to Login Page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Finding the login Link and Clicking on Login Link
        clickOnElement(By.linkText("Log in"));

        // Finding the email field for login
        sendTextToElement(By.xpath("//input[@id='Email']"),"kpatel@sparnex.com");

        // Finding the password field for login
        sendTextToElement(By.xpath("//input[@id='Password']"),"kps2582");

        // Finding the login button and pressing login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // Finding the logout button and clicking on it
        String actualMessage = getTextFromElement(By.xpath("//a[contains(text(),'Log out')]"));
        String expectedMessage = "Log out";

        // Validation of login
        Assert.assertEquals("Login is not successfully", expectedMessage, actualMessage);

        // logout
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));

    }

    @Test
    public void verifyTheErrorMessage() {
        //Finding the login Link and Clicking on Login Link
        clickOnElement(By.linkText("Log in"));

        // Finding the email field and passing a value
        sendTextToElement(By.xpath("//input[@id='Email']"),"test@gmail.com");

        // Finding the password field and passing a value
        sendTextToElement(By.xpath("//input[@id='Password']"),"test123");


        // Finding the log-in link and clicking on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        //This is from requirement
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
