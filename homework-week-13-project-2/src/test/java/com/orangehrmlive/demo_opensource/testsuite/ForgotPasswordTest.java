package com.orangehrmlive.demo_opensource.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.pages.ForgotPassword;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {


    HomePage homePage = new HomePage();
    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        homePage.setForgotPassword();
        Thread.sleep(1000);
        Assert.assertEquals(forgotPassword.getPageHeader(),"Forgot Your Password?","User is not on Forgot Password Page");


    }
}
