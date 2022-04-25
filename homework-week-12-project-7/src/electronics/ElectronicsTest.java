package electronics;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.sql.Timestamp;

public class ElectronicsTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verified(){
        mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
        mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]"));
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]"));

        String actualMessage1 = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String expectedMessage1 = "Cell phones";

        Assert.assertEquals("Not on correct Page!", expectedMessage1,actualMessage1);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
        mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]"));
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]"));

        String actualMessage1 = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String expectedMessage1 = "Cell phones";
        Assert.assertEquals("Not on correct Page!", expectedMessage1,actualMessage1);

        clickOnElement(By.xpath("//a[@class='viewmode-icon list' and contains(text(),'List')]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]"));


        String actualMessage2 = getTextFromElement(By.xpath("//h1[text()='Nokia Lumia 1020']"));
        String expectedMessage2 = "Nokia Lumia 1020";
        Assert.assertEquals("Not on correct Product!", expectedMessage2,actualMessage2);

        String actualMessage3 = getTextFromElement(By.xpath("//span[@id='price-value-20' and contains(text(),'$349.00')]"));
        String expectedMessage3 = "$349.00";
        Assert.assertEquals("Not on correct Product!", expectedMessage3,actualMessage3);

        setTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        setTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");
        Thread.sleep(2000);
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
        Thread.sleep(1000);

        String actualMessage4=getTextFromElement(By.xpath("//div/p[@class='content']"));
        System.out.println(actualMessage4);
        String expectedMessage4 = "The product has been added to your shopping cart";
        Assert.assertEquals("Item is not added",expectedMessage4,actualMessage4);

        clickOnElement(By.xpath("//span[@class='close']"));
        mouseHover(By.xpath("//span[contains(text(),'Shopping cart')]"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));

        String actualMessage5=getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String expectedMessage5 = "Shopping cart";
        Assert.assertEquals("Not navigated to Shopping Cart",expectedMessage5,actualMessage5);

        String actualMessage6=getTextFromElement(By.xpath("//td[@class='quantity']//input"),"value");
        String expectedMessage6 = "2";
        Assert.assertEquals("Not Correct Qty.",expectedMessage6,actualMessage6);

        String actualMessage7 = getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        String expectedMessage7 = "$698.00";
        Assert.assertEquals("Items is not added",expectedMessage7,actualMessage7);

        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        clickOnElement(By.xpath("//button[@id='checkout']"));

        String actualMessage8 = getTextFromElement(By.xpath("//div/h1[text()='Welcome, Please Sign In!']"));
        String expectedMessage8 = "Welcome, Please Sign In!";
        Assert.assertEquals("not navigated to sign in page", expectedMessage8,actualMessage8);

        clickOnElement(By.xpath("//button[contains(text(),'Register')]"));

        String actualMessage9 = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        String expectedMessage9 = "Register";
        Assert.assertEquals("not navigated to sign in page", expectedMessage9,actualMessage9);

        setTextToElement(By.xpath("//input[@id='FirstName']"),"John");
        setTextToElement(By.xpath("//input[@id='LastName']"),"Mark");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = "Mark"+timestamp.getTime()+"@domain.com";
        setTextToElement(By.xpath("//input[@id='Email']"),emailAddress);

        setTextToElement(By.xpath("//input[@id='Password']"),"Password123");
        setTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"Password123");

        clickOnElement(By.xpath("//button[@id='register-button']"));

        String actualMessage10 = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String expectedMessage10 = "Your registration completed";
        Assert.assertEquals("Registration Failed", expectedMessage10,actualMessage10);

        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));

        String actualMessage11 = getTextFromElement(By.xpath(" //h1[contains(text(),'Shopping cart')]"));
        String expectedMessage11 = "Shopping cart";
        Assert.assertEquals("Not on checkout page", expectedMessage11,actualMessage11);

        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        clickOnElement(By.xpath("//button[@id='checkout']"));


        setTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"),"Rahul");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"));
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"),"Dravid");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"));
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"),emailAddress);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"France");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"),"Lyon");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"123 Rue Rivoli");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"69007");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"034589210");

        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));

        clickOnElement(By.xpath("//input[@id='shippingoption_2']"));
        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));

        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));

        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"),"Visa");
        setTextToElement(By.xpath("//input[@id='CardholderName']"),"Amitabh Bachchan");
        setTextToElement(By.xpath("//input[@id='CardNumber']"),"4111111111111111");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"),"05");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"),"2023");
        setTextToElement(By.xpath("//input[@id='CardCode']"),"123");

        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));

        //Payment Method
        String actualMessage12 = getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
        String expectedMessage12 = "Credit Card";
        Assert.assertEquals("Payment method is wrong", expectedMessage12,actualMessage12);

        // Shipping Method :
        String actualMessage13 = getTextFromElement(By.xpath("//li[@class='shipping-method']/span[@class='value']"));
        String expectedMessage13 = "2nd Day Air";
        Assert.assertEquals("Shipping Method is wrong", expectedMessage13,actualMessage13);

        //Total :
        String actualMessage14 = getTextFromElement(By.xpath("//span[@class='value-summary']/strong[text()='$698.00']"));
        String expectedMessage14 = "$698.00";
        Assert.assertEquals("Total is wrong", expectedMessage14,actualMessage14);

        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        // Text thank you :
        String actualMessage15 = getTextFromElement(By.xpath("//h1[text()='Thank you']"));
        String expectedMessage15 = "Thank you";
        Assert.assertEquals("Confirm is failed", expectedMessage15,actualMessage15);

        // Your order has been successfully processed!
        String actualMessage16 = getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String expectedMessage16 = "Your order has been successfully processed!";
        Assert.assertEquals("Order placement is failed", expectedMessage16,actualMessage16);

        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

        // Welcome to our store
        String actualMessage17 = getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        String expectedMessage17 = "Welcome to our store";
        Assert.assertEquals("You are not on Homepage ", expectedMessage17,actualMessage17);

        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("Not Correct URL ", baseUrl,currentUrl);

    }


    @After
    public void tearDown() {
        closeBrowser();

    }

}
