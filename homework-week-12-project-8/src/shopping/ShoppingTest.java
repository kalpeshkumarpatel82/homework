package shopping;
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

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']"));

        String actualMessage1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage1 = "Bestsellers";
        Assert.assertEquals("Not on Bestsellers Page!", expectedMessage1, actualMessage1);

        Thread.sleep(2000);
        //mouseHover(By.xpath("//span[contains(text(),'Sales')]"));
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']"));
        String actualMessage2 = getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        String expectedMessage2 = "Product has been added to your cart";
        Assert.assertEquals("Failed to add items", expectedMessage2, actualMessage2);
        clickOnElement(By.xpath("//div/a[@class='close']"));
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        String actualMessage3 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage3 = "Your shopping cart - 1 item";
        Assert.assertEquals("Item is not added", expectedMessage3,actualMessage3);
        Thread.sleep(4000);

        //String actualMessage5_1 = getTextFromElement(By.tagName("span"));
        //String actualMessage5_1 = getTextFromElement(By.xpath("//div[@class='item-price']//span[@class='surcharge-cell']/child::span[1]"));
        //String actualMessage5_2 = getTextFromElement(By.xpath("//div[@class='item-price']//span/span[@class='surcharge-cell']/span[2]"));
        //String actualMessage5_3 = getTextFromElement(By.xpath("//div[@class='item-price']//span/span[@class='surcharge-cell']/span[3]"));
        //String actualMessage5_4 = getTextFromElement(By.xpath("//div[@class='item-price']//span/span[@class='surcharge-cell']/span[4]"));
        String actualMessage5_1 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[1]"));
        String actualMessage5_3 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[3]"));
        String actualMessage5_2 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[2]"));
        String actualMessage5_4 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[4]"));
        String actualMessage5 = actualMessage5_1+actualMessage5_2+actualMessage5_3+actualMessage5_4;
        String expectedMessage5 = "$299.00";
        Assert.assertEquals("Wrong subtotal", expectedMessage5,actualMessage5);

        String actualMessage6_1 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']"));
        String actualMessage6_2 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-integer']"));
        String actualMessage6_3 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']"));
        String actualMessage6_4 = getTextFromElement(By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']"));
        String actualMessage6 = actualMessage6_1+actualMessage6_2+actualMessage6_3+actualMessage6_4;
        String expectedMessage6 = "$309.73";
        Assert.assertEquals("Wrong total", expectedMessage6,actualMessage6);

        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));

        String actualMessage7 = getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        String expectedMessage7 = "Log in to your account";
        Assert.assertEquals("Not diverted to login Page", expectedMessage7,actualMessage7);

        setTextToElement(By.xpath("//input[@id='email']"),"Test@domain.be");
        clickOnElement(By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']"));

        String actualMessage8 = getTextFromElement(By.xpath("//h1[@class='title']"));
        String expectedMessage8 = "Secure Checkout";
        Assert.assertEquals("Not diverted to checkuout Page", expectedMessage8,actualMessage8);

        setTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"),"Bhim");
        setTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"),"Chhota");
        setTextToElement(By.xpath("//input[@id='shippingaddress-street']"),"14 Downing Street");
        setTextToElement(By.xpath("//input[@id='shippingaddress-city']"),"London");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='shippingaddress-country-code']"),"United Kingdom");
        setTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"),"London");
        setTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),"120458");
        setTextToElement(By.xpath("//input[@id='email']"));

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = "mark"+timestamp.getTime()+"@domain.com";
        setTextToElement(By.xpath("//input[@id='email']"),emailAddress);

        clickOnElement(By.xpath("//input[@id='create_profile']"));
        setTextToElement(By.xpath("//input[@id='password']"),"Password123");
        Thread.sleep(500);
        clickOnElement(By.xpath("//input[@id='method128']"));
        clickOnElement(By.xpath("//input[@id='pmethod6']"));
        Thread.sleep(500);
        String actualMessage9_1 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']"));
        String actualMessage9_2 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-integer']"));
        String actualMessage9_3 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']"));
        String actualMessage9_4 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']"));
        String actualMessage9 = actualMessage9_1+actualMessage9_2+actualMessage9_3+actualMessage9_4;
        String expectedMessage9 = "$311.03";
        Assert.assertEquals("Wrong total", expectedMessage9,actualMessage9);

        clickOnElement(By.xpath("//span[contains(text(),'Place order:')]"));
        Thread.sleep(2000);

        String actualMessage10 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage10 = "Thank you for your order";
        Assert.assertEquals("Not diverted to login Page", expectedMessage10,actualMessage10);
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']"));
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']"));

        String actualMessage1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage1 = "Bestsellers";
        Assert.assertEquals("Not on Bestsellers Page!", expectedMessage1, actualMessage1);

        Thread.sleep(1000);
        //mouseHover(By.xpath("//span[contains(text(),'Sales')]"));
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        Thread.sleep(1000);

        //clickOnElement(By.xpath("//a[contains(text(),'Apple Watch Sport 42mm with Sport Band')]"));
        clickOnElement(By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-39']"));

        String actualMessage2 = getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        String expectedMessage2 = "Product has been added to your cart";
        Assert.assertEquals("Failed to add item", expectedMessage2,actualMessage2);

        clickOnElement(By.xpath("//a[@class='close']"));
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        String actualMessage3 = getTextFromElement(By.xpath(" //h1[@id='page-title']"));
        String expectedMessage3 = "Your shopping cart - 1 item";
        Assert.assertEquals("not on checkout page", expectedMessage3,actualMessage3);

        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        String alertMessage4 = alertText();
        String expectedMessage4 = "Are you sure you want to clear your cart?";
        Assert.assertEquals("Alert nor pop-up", expectedMessage4,alertMessage4);

        alertHandle();
        Thread.sleep(1000);

        String actualMessage5 = getTextFromElement(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
        String expectedMessage5 = "Item(s) deleted from your cart";
        Assert.assertEquals("failed to delete items", expectedMessage5,actualMessage5);
        Thread.sleep(1000);
        String actualMessage6 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage6 = "Your cart is empty";
        Assert.assertEquals("failed to load empty cart page", expectedMessage6,actualMessage6);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
