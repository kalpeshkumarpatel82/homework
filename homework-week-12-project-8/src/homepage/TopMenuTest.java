package homepage;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;


public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        clickOnElement(By.xpath("//div/ul/li[@class='leaf']//a[text()='Shipping']"));
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Shipping";
        Assert.assertEquals("Not on Shipping Page!", expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        clickOnElement(By.xpath("//div/ul/li[@class='leaf']//a[text()='New!']"));
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "New arrivals";
        Assert.assertEquals("Not on New arrivals Page!", expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        clickOnElement(By.xpath("//div/ul/li[@class='leaf']//a[text()='Coming soon']"));
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Coming soon";
        Assert.assertEquals("Not on Coming soon Page!", expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        clickOnElement(By.xpath("//div/ul/li[@class='leaf']//a[text()='Contact us']"));
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Contact us";
        Assert.assertEquals("Not on Contact us Page!", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
