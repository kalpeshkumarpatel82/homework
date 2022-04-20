package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyThatSigningUpPageDisplay(){
        //Finding the register link and clicking on it
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();

        //Searching for a specif text, to verify if page navigated to correct page
        WebElement actualMessageText = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        String actualMessage = actualMessageText.getText();

        //Verification text
        String expectedMessage = "Signing up is easy!";

        //Verification of Test
        Assert.assertEquals("User is not on Correct Page!",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //Finding the register link and clicking on it
        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();

        //Finding the first name field and passing a value to it
        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
        firstName.sendKeys("Tarak");

        //Finding the last name field and passing a value to it
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
        lastName.sendKeys("Mehta");

        //Finding the address field and passing a value to it
        WebElement address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
        address.sendKeys("Gokuldham Society");

        //Finding the city field and passing a value to it
        WebElement city = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
        city.sendKeys("Mumbai");

        //Finding the state field and passing a value to it
        WebElement state = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
        state.sendKeys("Maharastra");

        //Finding the Zip Code field and passing a value to it
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        zipCode.sendKeys("410001");

        //Finding the Phone Number field and passing a value to it
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
        phoneNumber.sendKeys("0091 22 12345678");

        //Finding the SSN field and passing a value to it
        WebElement ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
        ssn.sendKeys("11223344");

        //Finding the User Name field and passing a value to it
        WebElement userName = driver.findElement(By.xpath("//input[@id='customer.username']"));
        userName.sendKeys("tarak_mehta");

        //Finding the Password field and passing a value to it
        WebElement passWord = driver.findElement(By.xpath("//input[@id='customer.password']"));
        passWord.sendKeys("Password123");

        //Finding the Password Confirm field and passing a value to it
        WebElement passWordConfirm = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
        passWordConfirm.sendKeys("Password123");

        //Finding the Register Button and clicking on it
        WebElement registerButton = driver.findElement(By.xpath("//input[@class='button' and @value='Register']"));
        registerButton.click();

        //Searching for a specif text, to verify if page navigated to correct page
        WebElement actualMessageText = driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
        String actualMessage = actualMessageText.getText();

        //Verification text
        String expectedMessage = "Your account was created successfully. You are now logged in.";

        //Verification of Test
        Assert.assertEquals("Failed to register",expectedMessage,actualMessage);

    }


    @After
    public void tearDown(){
        closeBrowser();
    }

}
