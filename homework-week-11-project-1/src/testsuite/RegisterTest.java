package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Finding the Register Link and Clicking on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();

        //Selecting the radio button for gender selection (here selecting male)
        WebElement genderRadiobtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderRadiobtn.click();

        //Inserting the firstName is the firstName
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstNameField.sendKeys("MyName");

        //Inserting the Surname is the Surname
        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastNameField.sendKeys("Patel");

        //Selecting the Day from dropdown menu
        WebElement daySelect = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[26]"));
        daySelect.click();

        // Selecting the month from dropdown menu
        WebElement monthSelect = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[6]"));
        monthSelect.click();

        // Selecting the month from dropdown menu
        WebElement yearSelect = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[65]"));
        yearSelect.click();

        // Selecting email field to enter an email
        WebElement emailFiled = driver.findElement(By.xpath("//input[@id='Email']"));
        emailFiled.sendKeys("kpatel@sparnex.com");

        // Selecting Password field to enter a password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys("kps2582");

        // Selecting Password field to enter a password
        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPasswordField.sendKeys("kps2582");

        // Click on register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButton.click();

        WebElement actualMessageText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageText.getText();

        String expectedMessage = "Your registration completed";

        Assert.assertEquals("User is not logged in", expectedMessage,actualMessage);

    }

    @After
    public void tearDown(){
       closeBrowser();
    }
}
