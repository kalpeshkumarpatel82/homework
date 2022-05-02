package com.x_cart.mobile.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellers bestSellers = new BestSellers();
    ShoppingCart shoppingCart = new ShoppingCart();
    LoginPageCheckOut loginPageCheckOut = new LoginPageCheckOut();
    CheckOut checkOut = new CheckOut();
    CheckOutConfirm checkOutConfirm = new CheckOutConfirm();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlled() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setBestSellers();

        bestSellers.mouseHoverToSortBy();
        bestSellers.setProductOrderByAscName();
        Thread.sleep(2000);
        bestSellers.setAppleIphoneLink();
        Assert.assertEquals(bestSellers.getGreenStatusMessage(), "Product has been added to your cart", "Product not added!");
        bestSellers.setCloseGreenStatus();
        bestSellers.setViewCartIcon();
        bestSellers.setViewCartButton();

        Assert.assertEquals(shoppingCart.getPageHeader(), "Your shopping cart - 1 item", "Item is not added");
        Assert.assertEquals(shoppingCart.getSubTotalPrice(), "$299.00", "Wrong SubTotal");
        Assert.assertEquals(shoppingCart.getTotalPrice(), "$309.73", "Wrong SubTotal");
        shoppingCart.setCheckOutButton();

        Assert.assertEquals(loginPageCheckOut.getPageHeader(), "Log in to your account", "Not diverted to checkout Page");
        loginPageCheckOut.setEmailField("Test123@noDomain.com");
        loginPageCheckOut.setContinueButton();
        Thread.sleep(2000);

        Assert.assertEquals(checkOut.getPageHeader(), "Secure Checkout", "Not diverted to checkout Page");
        checkOut.setFirstName("Bhim");
        checkOut.setLastName("Sen");
        checkOut.setAddress("15 Applewood Place");
        checkOut.clearCity();
        checkOut.setCity("Namur");
        checkOut.setCountry("Cuba");
        checkOut.setZipCode("456789");
        checkOut.clearEmailFiled();
        checkOut.setEmail("Bhimsen");
        Thread.sleep(3000);
        checkOut.setCreateProfile();
        checkOut.setPassword("myPassword789");
        checkOut.setDeliveryMethod();
        checkOut.setPaymentMethod();
        Thread.sleep(1000);
        Assert.assertEquals(checkOut.getTotalPrice(),"$311.03","Wrong Total");
        checkOut.setPlaceOrderButton();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutConfirm.getPageHeader(),"Thank you for your order","Checkout failed!");

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setBestSellers();

        bestSellers.mouseHoverToSortBy();
        bestSellers.setProductOrderByAscName();
        Thread.sleep(2000);
        bestSellers.setAstroLinkLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestSellers.getGreenStatusMessage(), "Product has been added to your cart", "Product not added!");
        bestSellers.setCloseGreenStatus();
        bestSellers.setViewCartIcon();
        bestSellers.setViewCartButton();
        Assert.assertEquals(shoppingCart.getPageHeader(), "Your shopping cart - 1 item", "Item is not added");

        shoppingCart.setEmptyCart();
        Assert.assertEquals(shoppingCart.fetchMessageFromAlert(),"Are you sure you want to clear your cart?","Failed to delete");
        shoppingCart.acceptAlertOk();
        Assert.assertEquals(shoppingCart.getConfirmDeleteMessage(),"Item(s) deleted from your cart","failed to delete items");
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.getPageHeader(),"Your cart is empty","failed to load empty cart page");

    }

}
