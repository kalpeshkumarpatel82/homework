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
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //Finding the Register Link and Clicking on Register Link
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));

        //Selecting the radio button for gender selection (here selecting male)
        clickOnElement(By.xpath("//input[@id='gender-male']"));

        //Inserting the firstName is the firstName
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"MyName");

        //Inserting the Surname is the Surname
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Patel");

        //Selecting the Day from dropdown menu
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthDay']"),"25");

        // Selecting the month from dropdown menu
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthMonth']"),"May");

        // Selecting the month from dropdown menu
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthYear']"),"1964");

        // Selecting email field to enter an email
        sendTextToElement(By.xpath("//input[@id='Email']"),"kpatel1@sparnex.com");

        // Selecting Password field to enter a password
        sendTextToElement(By.xpath("//input[@id='Password']"),"kps2582");

        // Selecting Password field to enter a password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"kps2582");

        // Click on register button
        clickOnElement(By.xpath("//button[@id='register-button']"));

        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

        String expectedMessage = "Your registration completed";

        Assert.assertEquals("User is not logged in", expectedMessage,actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
