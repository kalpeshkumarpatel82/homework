package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // Finding the link for Forgot your password link and clicking on it
        WebElement forGotPassword = driver.findElement(By.linkText("Forgot your password?"));
        forGotPassword.click();

        // Validation if user is on forgot password page on not
        WebElement actualMessageText = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualMessage = actualMessageText.getText();

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
