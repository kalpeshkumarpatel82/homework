package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //Finding the user field and passing the value
        WebElement userField = driver.findElement(By.name("txtUsername"));
        userField.sendKeys("Admin");

        //Finding the password field and passing the value
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");

        //finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.name("Submit"));
        loginButton.click();

        //Validation if user is on forgot password page on not
        WebElement actualMessageText = driver.findElement(By.partialLinkText("Welcome"));
        String actualMessage1 = actualMessageText.getText();

        // Triming the message only for first 6 characters
        String actualMessage = actualMessage1.substring(0,7);

        //required for a validation
        String expectedMessage = "Welcome";

        // Validating if user is on Jewelry section
        Assert.assertEquals("User is not logged in", expectedMessage,actualMessage);
    }


    @After
    public void tearDown(){
        closeBrowser();
    }
}
