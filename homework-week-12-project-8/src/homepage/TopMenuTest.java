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

    @Test //1
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        //clickOnElement(By.xpath("//div/ul/li[@class='leaf']//a[text()='Shipping']"));
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']//ul/li[3]/a")); //1.1 Click on the “Shipping” link

        // 1.2 Verify the text “Shipping”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Shipping";
        Assert.assertEquals("Not on Shipping Page!", expectedMessage, actualMessage);
    }

    @Test //2
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']//ul/li[4]/a")); // 2.1 Click on the “New!” link

        //2.2 Verify the text “New arrivals”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "New arrivals";
        Assert.assertEquals("Not on New arrivals Page!", expectedMessage, actualMessage);
    }

    @Test //3
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']//ul/li[5]/a"));		//3.1 Click on the “Coming soon” link

        //3.2 Verify the text “Coming soon”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Coming soon";
        Assert.assertEquals("Not on Coming soon Page!", expectedMessage, actualMessage);
    }

    @Test //4
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='collapse navbar-collapse']//ul/li[6]/a")); //		4.1 Click on the “Contact us” link

        //4.2 Verify the text “Contact us”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Contact us";
        Assert.assertEquals("Not on Contact us Page!", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
