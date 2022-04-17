package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        // Finding a sign in link and clicking on it
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // Searching a specific text
        WebElement actualMessageText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome Back!')]"));
        String actualMessage = actualMessageText.getText();

        // required for validation
        String expectedMessage = "Welcome Back!";

        // Validating a test
        Assert.assertEquals("User is not on Sign In Page", expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        // Finding a sign in link and clicking on it
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // Finding an email field and passing a value
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("test");

        // Finding a password field and passing a value
        WebElement passField = driver.findElement(By.name("user[password]"));
        passField.sendKeys("test123");

        // finding a login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//div/input[@value='Sign in']"));
        loginButton.click();

        // Searching a specif text
        WebElement actualMessageText = driver.findElement(By.xpath("//li[contains(text(),'Invalid email or password.')]"));
        String actualMessage = actualMessageText.getText();

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


