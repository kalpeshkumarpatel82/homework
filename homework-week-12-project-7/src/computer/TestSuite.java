package computer;
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

public class TestSuite extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void testName() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
        clickOnElement(By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]"));
        List<WebElement> listsAllDefault = listOfWebElementsList(By.xpath("//div[@class='prices']"));
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Price: Low to High");
        List<WebElement> listsAllAfterSort = listOfWebElementsList(By.xpath("//div[@class='prices']"));

        if (listsAllDefault != listsAllAfterSort) {
            System.out.println("Pass");
        }

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
        clickOnElement(By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]"));

        //selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Price: Low to High");


        clickOnElement(By.xpath("//span[contains(text(),'$1,200.00')]/parent::*/following-sibling::*/child::button[@type='button']"));
        //clickOnElement(By.xpath("//div/div[@class='buttons']/button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']"));
        //clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]"));

        String actualMessage1 = getTextFromElement(By.xpath("//h2/a[contains(text(),'Build your own computer')]"));
        String expectedMessage1 = "Build your own computer";
        Assert.assertEquals("Not correct Page!", expectedMessage1, actualMessage1);

        clickOnElement(By.partialLinkText("Build your own computer"));
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_1']"), "2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_2']"), "8GB [+$60.00]");
        Thread.sleep(1000);
        clickOnElement(By.id("product_attribute_3_7"));
        Thread.sleep(1000);
        clickOnElement(By.id("product_attribute_4_9"));
        Thread.sleep(1000);
        //clickOnElement(By.id("product_attribute_5_10"));
        clickOnElement(By.id("product_attribute_5_12"));
        Thread.sleep(1000);

        String actualPrice2 = getTextFromElement(By.xpath("//span[@id='price-value-1']"));
        System.out.println(actualPrice2);
        String expectedPrice2 = "$1,475.00";
        Assert.assertEquals("Not correct Config", expectedPrice2, actualPrice2);

        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));

        Thread.sleep(2000);

        String actualMessage3=getTextFromElement(By.xpath("//div/p[@class='content']"));
        String expectedMessage3 = "The product has been added to your shopping cart";
        Assert.assertEquals("Item is not added",expectedMessage3,actualMessage3);

        clickOnElement(By.xpath("//span[@class='close']"));
        mouseHover(By.xpath("//span[contains(text(),'Shopping cart')]"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));

        String actualMessage4 = getTextFromElement(By.xpath("//div/h1[text()='Shopping cart']"));
        String expectedMessage4 = "Shopping cart";
        Assert.assertEquals("Not on SHopping cart",expectedMessage4,actualMessage4);

        setTextToElement(By.xpath("//td[@class='quantity']//input"));
        setTextToElement(By.xpath("//td[@class='quantity']//input"),"2");
        clickOnElement(By.id("updatecart"));

        String actualMessage5 = getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        String expectedMessage5 = "$2,950.00";
        Assert.assertEquals("Items is not added",expectedMessage5,actualMessage5);

        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        clickOnElement(By.xpath("//button[@id='checkout']"));

        String actualMessage6 = getTextFromElement(By.xpath("//div/h1[text()='Welcome, Please Sign In!']"));
        String expectedMessage6 = "Welcome, Please Sign In!";
        Assert.assertEquals("not navigated to sign in page", expectedMessage6,actualMessage6);

        clickOnElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"),"Mr.Antony");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"),"Ross");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"),"test@test.be");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"Belgium");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"),"Brussels");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"Rue Royal 1");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"1060");
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"003247123456");
        clickOnElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']"));
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        //Thread.sleep(3000);

        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));

        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"),"Master card");
        setTextToElement(By.xpath("//input[@id='CardholderName']"),"Antony Ross");

        setTextToElement(By.xpath("//input[@id='CardNumber']"),"5555555555554444");
        //https://www.paypalobjects.com/en_GB/vhelp/paypalmanager_help/credit_card_numbers.htm
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"),"05");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"),"2023");
        setTextToElement(By.xpath("//input[@id='CardCode']"),"123");
        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));

        //Payment Method
        String actualMessage7 = getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
        String expectedMessage7 = "Credit Card";
        Assert.assertEquals("Payment method is wrong", expectedMessage7,actualMessage7);

        // Shipping Method :
        String actualMessage8 = getTextFromElement(By.xpath("//li[@class='shipping-method']/span[@class='value']"));
        String expectedMessage8 = "Next Day Air";
        Assert.assertEquals("Shipping Method is wrong", expectedMessage8,actualMessage8);

        //Total :
        String actualMessage9 = getTextFromElement(By.xpath("//span[@class='value-summary']/strong[text()='$2,950.00']"));
        String expectedMessage9 = "$2,950.00";
        Assert.assertEquals("Total is wrong", expectedMessage9,actualMessage9);

        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        // Text thank you :
        String actualMessage10 = getTextFromElement(By.xpath("//h1[text()='Thank you']"));
        String expectedMessage10 = "Thank you";
        Assert.assertEquals("Confirm is failed", expectedMessage10,actualMessage10);

        // Your order has been successfully processed!
        String actualMessage11 = getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String expectedMessage11 = "Your order has been successfully processed!";
        Assert.assertEquals("Order placement is failed", expectedMessage11,actualMessage11);

        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

        // Welcome to our store
        String actualMessage12 = getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        String expectedMessage12 = "Welcome to our store";
        Assert.assertEquals("You are not on Homepage ", expectedMessage12,actualMessage12);

    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}
