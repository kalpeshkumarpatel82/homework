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

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // Finding the link for Forgot your password link and clicking on it
        clickOnElement(By.linkText("Forgot your password?"));

        // Validation if user is on forgot password page on not
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));

        // Required for a validating
        String expectedMessage = "Forgot Your Password?";

        // Validating if user is on Jewelry section
        Assert.assertEquals("User is not on Forgot Password Page", expectedMessage,actualMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
