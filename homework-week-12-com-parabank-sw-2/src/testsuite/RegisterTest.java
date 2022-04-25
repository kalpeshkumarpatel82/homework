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

public class RegisterTest extends Utility {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //Finding the register link and clicking on it
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        //Searching for a specif text, to verify if page navigated to correct page
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));

        //Verification text
        String expectedMessage = "Signing up is easy!";

        //Verification of Test
        Assert.assertEquals("User is not on Correct Page!", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Finding the register link and clicking on it
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        //Finding the first name field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.firstName']"),"Tarak");

        //Finding the last name field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"),"Mehta");

        //Finding the address field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.address.street']"),"Gokuldham Society");

        //Finding the city field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"),"Mumbai");

        //Finding the state field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"),"Maharastra");

        //Finding the Zip Code field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"),"410001");


        //Finding the Phone Number field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"),"0091 22 12345678");


        //Finding the SSN field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"),"11223344");


        //Finding the User Name field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.username']"),"tarak_mehta");

        //Finding the Password field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='customer.password']"),"Password123");

        //Finding the Password Confirm field and passing a value to it
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"),"Password123");

        //Finding the Register Button and clicking on it
        clickOnElement(By.xpath("//input[@class='button' and @value='Register']"));

        //Searching for a specif text, to verify if page navigated to correct page
        String actualMessage = getTextFromElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));

        //Verification text
        String expectedMessage = "Your account was created successfully. You are now logged in.";

        //Verification of Test
        Assert.assertEquals("Failed to register", expectedMessage, actualMessage);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
