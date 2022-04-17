package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        OpenBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Finding the Computer Section's Link and Clicking on it
        WebElement computerLink = driver.findElement(By.linkText("Computers"));
        computerLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageComputer = "Computers";

        // Finding the computer section hyperlink and capturing the message
        WebElement actualMessageTextComputers = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessageComputer = actualMessageTextComputers.getText();

        // Validating if user is on Computer section
        Assert.assertEquals("Not on Computer sections",expectedMessageComputer,actualMessageComputer );

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Finding the Electronics Section's Link and Clicking on it
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        electronicsLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageElectronics = "Electronics";

        // Finding the Electronics section hyperlink and capturing the message
        WebElement actualMessageTextElectronics = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessageElectronics = actualMessageTextElectronics.getText();

        // Validating if user is on Electronics section
        Assert.assertEquals("Not on Electronics sections",expectedMessageElectronics,actualMessageElectronics);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //Finding the Apparel Section's Link and Clicking on it
        WebElement apparelLink = driver.findElement(By.linkText("Apparel"));
        apparelLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageApparel = "Apparel";

        // Finding the Apparel section hyperlink and capturing the message
        WebElement actualMessageTextApparel = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessageApparel = actualMessageTextApparel.getText();

        // Validating if user is on Apparel section
        Assert.assertEquals("Not on Apparel sections",expectedMessageApparel,actualMessageApparel);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //Finding the Digital downloads Section's Link and Clicking on it
        WebElement dDLink = driver.findElement(By.linkText("Digital downloads"));
        dDLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageDD = "Digital downloads";

        // Finding the Digital downloads section hyperlink and capturing the message
        WebElement actualMessageTextDD = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessageDD = actualMessageTextDD.getText();

        // Validating if user is on Digital downloads section
        Assert.assertEquals("Not on Digital Download sections",expectedMessageDD,actualMessageDD);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //Finding the Books Section's Link and Clicking on it
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageBooks = "Books";

        // Finding the Books section hyperlink and capturing the message
        WebElement actualMessageTextBooks = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessageBooks = actualMessageTextBooks.getText();

        // Validating if user is on Books section
        Assert.assertEquals("Not on Digital Download sections",expectedMessageBooks,actualMessageBooks);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //Finding the Jewelry Section's Link and Clicking on it
        WebElement jewelLink = driver.findElement(By.linkText("Jewelry"));
        jewelLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageJewelry = "Jewelry";

        // Finding the Jewelry section hyperlink and capturing the message
        WebElement actualMessageTextJewel = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessageJewel = actualMessageTextJewel.getText();

        // Validating if user is on Jewelry section
        Assert.assertEquals("Not on Digital Download sections",expectedMessageJewelry,actualMessageJewel);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //Finding the Gift Cards Section's Link and Clicking on it
        WebElement giftCardLink = driver.findElement(By.linkText("Gift Cards"));
        giftCardLink.click();

        //Required to validate the test, details in Specification docs
        String expectedMessageGiftCard = "Gift Cards";

        // Finding the Gift Cards section hyperlink and capturing the message
        WebElement actualMessageTextGiftCard = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessageGiftCard = actualMessageTextGiftCard.getText();

        // Validating if user is on Gift Cards section
        Assert.assertEquals("Not on Digital Download sections",expectedMessageGiftCard,actualMessageGiftCard);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
