package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // finding a field User Name (Valid) and passing a value
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("tarak_mehta");

        // finding a field Password (Valid) and passing a value
        WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
        passWord.sendKeys("Password123");

        // finding a login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button' and @value='Log In']"));
        loginButton.click();

        //Searching for a specif text, to verify if page navigated to correct page
        WebElement actualMessageText = driver.findElement(By.xpath("//h1[@class='title' and contains(text(),'Accounts Overview')]"));
        String actualMessage = actualMessageText.getText();

        //Verification text
        String expectedMessage = "Accounts Overview";

        //Verification of Test
        Assert.assertEquals("Login Failed!", expectedMessage,actualMessage);

    }

    @Test
    public void verifyTheErrorMessage(){
        // finding a field User Name (Invalid) and passing a value
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("tarak_mehta1");

        // finding a field Password (Invalid) and passing a value
        WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
        passWord.sendKeys("Password111");

        // finding a login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button' and @value='Log In']"));
        loginButton.click();

        //Searching for a specif text, to verify if page navigated to correct page
        WebElement actualMessageText = driver.findElement(By.xpath("//p[text()='The username and password could not be verified.']"));
        String actualMessage = actualMessageText.getText();

        //Verification text
        String expectedMessage = "The username and password could not be verified.";

        //Verification of Test
        Assert.assertEquals("Test Failed",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        // finding a field User Name (Valid) and passing a value
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("tarak_mehta");

        // finding a field Password (Valid) and passing a value
        WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
        passWord.sendKeys("Password123");

        // finding a login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button' and @value='Log In']"));
        loginButton.click();

        // finding a logout button and clicking on it
        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log Out']"));
        logoutButton.click();

        //Searching for a specif text, to verify if page navigated to correct page
        WebElement actualMessageText = driver.findElement(By.xpath("//h2[text()='Customer Login']"));
        String actualMessage = actualMessageText.getText();

        //Verification text
        String expectedMessage = "Customer Login";

        //Verification of Test
        Assert.assertEquals("Failed to Logout!",expectedMessage,actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
