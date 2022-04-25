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

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Finding the Computer Section's Link and Clicking on it
        clickOnElement(By.linkText("Computers"));

        //Required to validate the test, details in Specification docs
        String expectedMessageComputer = "Computers";

        // Finding the computer section hyperlink and capturing the message
        String actualMessageComputer = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        // Validating if user is on Computer section
        Assert.assertEquals("Not on Computer sections", expectedMessageComputer, actualMessageComputer);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Finding the Electronics Section's Link and Clicking on it
        clickOnElement(By.linkText("Electronics"));

        //Required to validate the test, details in Specification docs
        String expectedMessageElectronics = "Electronics";

        // Finding the Electronics section hyperlink and capturing the message
        String actualMessageElectronics = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        // Validating if user is on Electronics section
        Assert.assertEquals("Not on Electronics sections", expectedMessageElectronics, actualMessageElectronics);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //Finding the Apparel Section's Link and Clicking on it
        clickOnElement(By.linkText("Apparel"));

        //Required to validate the test, details in Specification docs
        String expectedMessageApparel = "Apparel";

        // Finding the Apparel section hyperlink and capturing the message
        String actualMessageApparel = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        // Validating if user is on Apparel section
        Assert.assertEquals("Not on Apparel sections", expectedMessageApparel, actualMessageApparel);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //Finding the Digital downloads Section's Link and Clicking on it
        clickOnElement(By.linkText("Digital downloads"));

        //Required to validate the test, details in Specification docs
        String expectedMessageDD = "Digital downloads";

        // Finding the Digital downloads section hyperlink and capturing the message
        String actualMessageDD = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        // Validating if user is on Digital downloads section
        Assert.assertEquals("Not on Digital Download sections", expectedMessageDD, actualMessageDD);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //Finding the Books Section's Link and Clicking on it
        clickOnElement(By.linkText("Books"));

        //Required to validate the test, details in Specification docs
        String expectedMessageBooks = "Books";

        // Finding the Books section hyperlink and capturing the message
        String actualMessageBooks = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        // Validating if user is on Books section
        Assert.assertEquals("Not on Books sections", expectedMessageBooks, actualMessageBooks);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        //Finding the Jewelry Section's Link and Clicking on it
        clickOnElement(By.linkText("Jewelry"));

        //Required to validate the test, details in Specification docs
        String expectedMessageJewelry = "Jewelry";

        // Finding the Jewelry section hyperlink and capturing the message
        String actualMessageJewel = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        // Validating if user is on Jewelry section
        Assert.assertEquals("Not on Jewelry sections", expectedMessageJewelry, actualMessageJewel);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        //Finding the Gift Cards Section's Link and Clicking on it
        clickOnElement(By.linkText("Gift Cards"));

        //Required to validate the test, details in Specification docs
        String expectedMessageGiftCard = "Gift Cards";

        // Finding the Gift Cards section hyperlink and capturing the message
        String actualMessageGiftCard = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        // Validating if user is on Gift Cards section
        Assert.assertEquals("Not on Gift Cards sections", expectedMessageGiftCard, actualMessageGiftCard);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
