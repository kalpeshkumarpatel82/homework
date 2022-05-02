package com.herokuapp.the_internet.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.herokuapp.the_internet.pages.LoginPage;
import com.herokuapp.the_internet.pages.SecureArea;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    SecureArea secureArea = new SecureArea();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.setLoginButton();
        Assert.assertEquals(secureArea.getPageHeader(), "Secure Area\nWelcome to the Secure Area. When you are done click logout below.\nLogout", "User is not logged in");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.setUserName("tomsmith1");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.setLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(),"Your username is invalid!\n×","User is not logged in ");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword");
        loginPage.setLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(),"Your password is invalid!\n×","User is not logged in ");
    }
}
