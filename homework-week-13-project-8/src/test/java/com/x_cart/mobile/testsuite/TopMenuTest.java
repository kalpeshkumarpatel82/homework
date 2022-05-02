package com.x_cart.mobile.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Shipping shipping = new Shipping();
    NewMenu newMenu = new NewMenu();
    ComingSoon comingSoon = new ComingSoon();
    ContactUs contactUs = new ContactUs();


    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.setShippingLink();
        Assert.assertEquals(shipping.getPageHeader(), "Shipping", "Not on Shipping Page!");
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.setNewLink();
        Assert.assertEquals(newMenu.getPageHeader(), "New arrivals", "Not on New arrivals Page!");
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        homePage.setComingSoon();
        Assert.assertEquals(comingSoon.getPageHeader(), "Coming soon", "Not on Coming soon Page!");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        homePage.setContactUs();
        Assert.assertEquals(contactUs.getPageHeader(), "Contact us", "Not on Contact us Page!");
    }

}
