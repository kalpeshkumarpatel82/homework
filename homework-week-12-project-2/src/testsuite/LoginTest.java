package testsuite;
/* 
 Created by Kalpesh Patel
 */

import Utilities.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Finding the user field and passing the value
        sendTextToElement(By.name("txtUsername"),"Admin");

        //Finding the password field and passing the value
        sendTextToElement(By.name("txtPassword"),"admin123");

        //finding the login button and clicking on it
        clickOnElement(By.name("Submit"));

        //Validation if user is on forgot password page on not
        String actualMessage1 = getTextFromElement(By.partialLinkText("Welcome"));

        // Triming the message only for first 6 characters
        String actualMessage = actualMessage1.substring(0, 7);

        //required for a validation
        String expectedMessage = "Welcome";

        // Validating if user is on Jewelry section
        Assert.assertEquals("User is not logged in", expectedMessage, actualMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
