package com.parasoft.parabank.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.pages.Account;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.Registration;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();
    Account account = new Account();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.setUserName("babuchhota");
        homePage.setPassword("passWord789");
        homePage.setLoginButton();
        Assert.assertEquals(account.getPageHeader(),"Accounts Overview","Login Failed!");

    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.setUserName("babuchhota12");
        homePage.setPassword("Password111");
        homePage.setLoginButton();
        Assert.assertEquals(homePage.getErrorMessage(),"The username and password could not be verified.","Test Failed");
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.setUserName("babuchhota");
        homePage.setPassword("passWord789");
        homePage.setLoginButton();
        account.setLogOutButton();
        Assert.assertEquals(homePage.getPageHeader(),"Customer Login","Failed to Logout");
    }



}
