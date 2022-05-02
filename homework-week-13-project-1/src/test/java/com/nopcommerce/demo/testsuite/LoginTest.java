package com.nopcommerce.demo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.pages.Account;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Account account = new Account();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getPageHeader(), "Welcome, Please Sign In!", "Not Navigate to Login Pag");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.setUserName("kpa@sparnex.com");
        loginPage.setPassWord("kps2582");
        loginPage.setLoginButton();
        Assert.assertEquals(account.getLogOutLinkText(), "Log out", "Login is not successfully");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLoginLink();
        loginPage.setUserName("kpatel12@sparnex.com");
        loginPage.setPassWord("kps2582");
        loginPage.setLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage,"ot navigate to login page");

    }

}
