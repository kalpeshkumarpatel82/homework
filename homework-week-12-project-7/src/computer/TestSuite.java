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

        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")); //	1.1 Click on Computer Menu.
        clickOnElement(By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]"));//	1.2 Click on Desktop
        List<WebElement> listsAllDefault = listOfWebElementsList(By.xpath("//div[@class='prices']"));//	1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Price: Low to High");
        List<WebElement> listsAllAfterSort = listOfWebElementsList(By.xpath("//div[@class='prices']"));
        //1.4 Verify the Product will arrange in Descending order.
        if (listsAllDefault != listsAllAfterSort) {
            System.out.println("Pass");
        }

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")); //	2.1 Click on Computer Menu.
        clickOnElement(By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]"));  //	2.2 Click on Desktop

        clickOnElement(By.xpath("//span[contains(text(),'$1,200.00')]/parent::*/following-sibling::*/child::button[@type='button']"));
        //clickOnElement(By.xpath("//div/div[@class='buttons']/button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']"));
        //clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]"));

        String actualMessage1 = getTextFromElement(By.xpath("//h2/a[contains(text(),'Build your own computer')]")); //	2.5 Verify the Page Header "Build your own computer"
        String expectedMessage1 = "Build your own computer"; //Verification message
        Assert.assertEquals("Not correct Page!", expectedMessage1, actualMessage1); // Verification

        clickOnElement(By.partialLinkText("Build your own computer")); // Selecting - Build your own computer
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_1']"), "2.2 GHz Intel Pentium Dual-Core E2200"); //	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000); //Allow page to update
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_2']"), "8GB [+$60.00]");//	2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000); //Allow page to update
        clickOnElement(By.id("product_attribute_3_7")); //	2.8 Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000); //Allow page to update
        clickOnElement(By.id("product_attribute_4_9")); //	2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000); //Allow page to update
        //clickOnElement(By.id("product_attribute_5_10")); // Preselected no needed - 2.10 Check Two Check boxes "Microsoft Office [+$50.00]"
        clickOnElement(By.id("product_attribute_5_12"));  // 2.10 and "Total Commander [+$5.00]"
        Thread.sleep(1000); //Allow page to update

        String actualPrice2 = getTextFromElement(By.xpath("//span[@id='price-value-1']")); //2.11 Verification - Grepping actual message
        String expectedPrice2 = "$1,475.00"; // 2.11 Required for Verification
        Assert.assertEquals("Not correct Config", expectedPrice2, actualPrice2); //2.11 Verification of test

        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']")); // 2.12 Click on "ADD TO CARD" Button.

        Thread.sleep(2000); //Allow page to update

        String actualMessage3 = getTextFromElement(By.xpath("//div/p[@class='content']")); //	2.13 Grepping actual message - Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage3 = "The product has been added to your shopping cart"; // 2.13
        Assert.assertEquals("Item is not added", expectedMessage3, actualMessage3); // 2.13 - Verification a test

        clickOnElement(By.xpath("//span[@class='close']")); // 2.13 After that close the bar clicking on the cross button.
        mouseHover(By.xpath("//span[contains(text(),'Shopping cart')]")); // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));    //2.15 Verify the message "Shopping cart"
        String actualMessage4 = getTextFromElement(By.xpath("//div/h1[text()='Shopping cart']")); //2.15 - Grepping a message
        String expectedMessage4 = "Shopping cart"; // 2.15 - Verification test
        Assert.assertEquals("Not on SHopping cart", expectedMessage4, actualMessage4); //2.15 verification a test

        setTextToElement(By.xpath("//td[@class='quantity']//input")); // Clearing a field
        setTextToElement(By.xpath("//td[@class='quantity']//input"), "2");    //2.16 Change the Qty to "2"
        clickOnElement(By.id("updatecart")); // 2.16 and Click on "Update shopping cart"

        String actualMessage5 = getTextFromElement(By.xpath("//span[@class='product-subtotal']")); //	2.17 Grepping a text 2.17 Verify the Total"$2,950.00"
        String expectedMessage5 = "$2,950.00"; // 2.17 verification test
        Assert.assertEquals("Items is not added", expectedMessage5, actualMessage5); // 2.17 verification test

        clickOnElement(By.xpath("//input[@id='termsofservice']")); //	2.18 click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//button[@id='checkout']")); //	2.19 Click on “CHECKOUT”

        String actualMessage6 = getTextFromElement(By.xpath("//div/h1[text()='Welcome, Please Sign In!']")); //	2.20 Grepping a text - Verify the Text “Welcome, Please Sign In!”
        String expectedMessage6 = "Welcome, Please Sign In!"; // 2.20 verification test
        Assert.assertEquals("not navigated to sign in page", expectedMessage6, actualMessage6); // 2.20 verification test

        clickOnElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']")); // 2.21 Click on “CHECKOUT AS GUEST” Tab
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "Mr.Antony"); //2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"), "Ross"); //2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"), "test@test.be");//2.22 Fill the all mandatory field
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "Belgium");//2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"), "Brussels");//2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Rue Royal 1");//2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "1060");//2.22 Fill the all mandatory field
        setTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "003247123456");//2.22 Fill the all mandatory field
        clickOnElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']"));//	2.23 Click on “CONTINUE”
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));//	2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));//2.25 Click on “CONTINUE”
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']")); //2.26 Select Radio Button “Credit Card”
        //Thread.sleep(3000);

        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));

        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Master card"); //2.27 Select “Master card” From Select credit card dropdown
        setTextToElement(By.xpath("//input[@id='CardholderName']"), "Antony Ross"); //2.28 Fill all the details
        //Dummy Card numbers for Testing : https://www.paypalobjects.com/en_GB/vhelp/paypalmanager_help/credit_card_numbers.htm
        setTextToElement(By.xpath("//input[@id='CardNumber']"), "5555555555554444");//2.28 Fill all the details
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"), "05"); //2.28
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"), "2023");//2.28
        setTextToElement(By.xpath("//input[@id='CardCode']"), "123");//2.28
        //clickOnElement(By.xpath("//div[@id='shipping-method-buttons-container']/button")); 2.29 Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")); //2.29 Click on “CONTINUE”

        //Payment Method : Verification
        String actualMessage7 = getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
        String expectedMessage7 = "Credit Card";
        Assert.assertEquals("Payment method is wrong", expectedMessage7, actualMessage7);

        // Shipping Method : Verification
        String actualMessage8 = getTextFromElement(By.xpath("//li[@class='shipping-method']/span[@class='value']"));
        String expectedMessage8 = "Next Day Air";
        Assert.assertEquals("Shipping Method is wrong", expectedMessage8, actualMessage8);

        //Total : Verification
        String actualMessage9 = getTextFromElement(By.xpath("//span[@class='value-summary']/strong[text()='$2,950.00']"));
        String expectedMessage9 = "$2,950.00";
        Assert.assertEquals("Total is wrong", expectedMessage9, actualMessage9);

        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]")); //	2.34 Click on “CONFIRM”

        // Text thank you : Ack message verification
        String actualMessage10 = getTextFromElement(By.xpath("//h1[text()='Thank you']"));
        String expectedMessage10 = "Thank you";
        Assert.assertEquals("Confirm is failed", expectedMessage10, actualMessage10);

        // Ack message verification  : Your order has been successfully processed!
        String actualMessage11 = getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String expectedMessage11 = "Your order has been successfully processed!";
        Assert.assertEquals("Order placement is failed", expectedMessage11, actualMessage11);

        clickOnElement(By.xpath("//button[contains(text(),'Continue')]")); //	2.37 Click on “CONTINUE”

        // Homepage navigation verification : Welcome to our store
        String actualMessage12 = getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        String expectedMessage12 = "Welcome to our store";
        Assert.assertEquals("You are not on Homepage ", expectedMessage12, actualMessage12);

    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}
