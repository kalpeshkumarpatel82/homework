package testsuite;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValid() {

        //Finding username field and passing a value
        sendTextToElement(By.id("user-name"), "standard_user");

        //Finding password field and passing a value
        sendTextToElement(By.id("password"), "secret_sauce");

        //finding login button and clicking on it
        clickOnElement(By.id("login-button"));

        // Finding if actual text in present or not
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));

        //Required for validation
        String expectedMessage = "PRODUCTS";

        //Validating the test
        Assert.assertEquals("User is not logged in", expectedMessage, actualMessage);

    }


    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Finding username field and passing a value
        sendTextToElement(By.id("user-name"), "standard_user");

        //Finding password field and passing a value
        sendTextToElement(By.id("password"), "secret_sauce");


        //finding login button and clicking on it
        clickOnElement(By.id("login-button"));

        // Finding if actual text in present or not
        List<WebElement> Items = listOfWebElementsList(By.xpath("//div[@class='inventory_item']"));
        int actualCountedItems = Items.size();

        //Required for validation
        int expectedItems = 6;

        // validating a test
        Assert.assertEquals("Nr of items are not Six", expectedItems, actualCountedItems);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
