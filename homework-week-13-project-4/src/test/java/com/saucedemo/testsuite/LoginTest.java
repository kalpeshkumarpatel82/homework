package com.saucedemo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.Products;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    Products products = new Products();

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        homePage.setUserName("standard_user");
        homePage.setPassWord("secret_sauce");
        homePage.setLoginButton();
        Assert.assertEquals(products.getPageHeader(),"PRODUCTS","User is not logged in");


    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homePage.setUserName("standard_user");
        homePage.setPassWord("secret_sauce");
        homePage.setLoginButton();
        Assert.assertEquals(products.getItemsDisplayed(),6,"Nr of items are not Six");
    }

}
