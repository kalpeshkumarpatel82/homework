package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        OpenBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Finding the login Link and Clicking on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Searching the test element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();

        // This is expected Message and taken from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Validating actual and exacted results
        Assert.assertEquals("Not Navigate to Login Page", expectedMessage,actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Finding the login Link and Clicking on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Finding the email field for login
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("kpatel@sparnex.com");

        // Finding the password field for login
        WebElement passField = driver.findElement(By.xpath("//input[@id='Password']"));
        passField.sendKeys("kps2582");

        // Finding the login button and pressing login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        String expectedMessage = "Log out";

        // Finding the logout button and clicking on it
        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = logoutButton.getText();

        // Validation of login
        Assert.assertEquals("Login is not successfully", expectedMessage,actualMessage);

        // logout
        logoutButton.click();

    }

    @Test
    public void verifyTheErrorMessage(){
        //Finding the login Link and Clicking on Login Link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Finding the email field and passing a value
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("test@gmail.com");

        // Finding the password field and passing a value
        WebElement passField = driver.findElement(By.xpath("//input[@id='Password']"));
        passField.sendKeys("test123");

        // Finding the log-in link and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        //This is from requirement
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualMessageElement.getText();

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @After
    public void tearDown(){
       closeBrowser();
    }

}
