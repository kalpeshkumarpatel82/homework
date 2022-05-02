package com.ultimateqa.courses.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.setSignInLink();
        Assert.assertEquals(loginPage.getPageHeader(),"Welcome Back!","User is not on Sign In Page");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.setSignInLink();
        loginPage.setUserName("test");
        loginPage.setPassWord("test123");
        loginPage.setSignInLink();
        Assert.assertEquals(loginPage.getErrMessage(),"Invalid email or password.","Test Failed");




    }
}
