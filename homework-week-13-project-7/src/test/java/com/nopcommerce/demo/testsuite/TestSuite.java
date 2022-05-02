package com.nopcommerce.demo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    Computers computers = new Computers();
    Desktop desktop = new Desktop();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    LoginCheckOutPage loginCheckOutPage = new LoginCheckOutPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutCompleted checkOutCompleted = new CheckOutCompleted();

    @Test
    public void testName() throws InterruptedException {
        homePage.selectMenu("Computers"); // Click on Computers from Top Menu
        computers.clickOnDesktop(); // Click on DeskTop from Computer Page

        List<Double> expectedList= desktop.getPriceOrderList();
        Collections.sort(expectedList);

        //System.out.println(expectedList);
        desktop.sortByLowToHigh("Price: Low to High");
        Thread.sleep(2000);
        List<Double> actualList= desktop.getPriceOrderList();
        Thread.sleep(2000);

        //System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by high to low");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectMenu("Computers"); // Click on Computers from Top Menu

        computers.clickOnDesktop(); // Click on DeskTop from Computer Page

        desktop.sortByLowToHigh("Price: Low to High");
        Thread.sleep(2000);
        desktop.setClickOnBuildOnYourComputer();
        Assert.assertEquals(desktop.getItemTitle(),"Build your own computer","Not navigated to correct Page!");
        desktop.addToCartBuildOnYourComputerlink();

        Assert.assertEquals(buildYourOwnComputer.getPageHeader(),"Build your own computer","Not navigated to correct Page");
        buildYourOwnComputer.setSelectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(1000);
        buildYourOwnComputer.setSelectRam("8GB [+$60.00]");
        Thread.sleep(1000);
        buildYourOwnComputer.setSelect400GBHDD();
        Thread.sleep(1000);
        buildYourOwnComputer.setSelectVistaPremium();
        Thread.sleep(1000);
        buildYourOwnComputer.setTotalCommander();
        Thread.sleep(1000);
        Assert.assertEquals(buildYourOwnComputer.getProductPrice(),"$1,475.00", "Not Correct Total!");
        buildYourOwnComputer.setClickOnAddToCartButton();
        Assert.assertEquals(buildYourOwnComputer.getInfoFromGreenBar(),"The product has been added to your shopping cart","Failed to add cart");
        buildYourOwnComputer.setCloseGreenBar();
        buildYourOwnComputer.mouseHoverToShoppingCartLink();
        buildYourOwnComputer.clickOnGoToCartButton();

        Assert.assertEquals(shoppingCart.getPageHeader(),"Shopping cart", "Not navigated to Shopping Cart!!");
        shoppingCart.clearQuantity();
        shoppingCart.changeQuantity("2");
        shoppingCart.setUpdateCartButton();
        Assert.assertEquals(shoppingCart.getTotalCheckoutPrice(),"$2,950.00","Quantity is not updated to 2 to shopping card");
        shoppingCart.setTermAndConditionsCheckBox();
        shoppingCart.setCheckOutButton();

        Assert.assertEquals(loginCheckOutPage.getPageHeader(), "Welcome, Please Sign In!", "Not navigated to sign in page");
        loginCheckOutPage.setCheckOutAsGuestButton();

        checkOutPage.setFirstName("Mr. Anil");
        checkOutPage.setLastName("Kapoor");
        checkOutPage.setEmailAddress("anil.kapoor@madhuri.co.in");
        checkOutPage.setCountry("India");
        checkOutPage.setCity("Mumbai");
        checkOutPage.setAddress("1 Nariman Point");
        checkOutPage.setZipCode("410011");
        checkOutPage.setPhoneNumber("022 785245698");
        checkOutPage.setClickOnContinueButton1();
        checkOutPage.setShippingOptionNextDayByAir();
        checkOutPage.setClickOnContinueButton2();
        checkOutPage.setPaymentMethod();
        checkOutPage.setClickOnContinueButton3();
        checkOutPage.setCreditCardType("Master card");
        checkOutPage.setCreditCardHolderName("Mrs. Madhuri Dixit");
        checkOutPage.setCreditCardNumber("5555555555554444");
        checkOutPage.setExpireMonth("10");
        checkOutPage.setExpireYear("2025");
        checkOutPage.setCardCode("123");
        checkOutPage.setClickOnContinueButton4();
        Assert.assertEquals(checkOutPage.getPaymentMethod(),"Credit Card","Not Correct Payment Method!");
        Assert.assertEquals(checkOutPage.getShippingMethod(),"Next Day Air","Not Correct shipping Method!");
        Assert.assertEquals(checkOutPage.getTotal(),"$2,950.00","Not Correct total!");
        checkOutPage.setConfirmButton();

        Assert.assertEquals(checkOutCompleted.getPageHeader(),"Thank you","Order failed to Place!");
        Assert.assertEquals(checkOutCompleted.getConfirmMessage(),"Your order has been successfully processed!","Order failed to Place!");
        checkOutCompleted.setContinueButton();

        Assert.assertEquals(homePage.getPageHeader(),"Welcome to our store","Failed to navigaet to Home Page!");

    }


}
