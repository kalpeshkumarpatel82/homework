package com.orangehrmlive.demo_opensource.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.pages.AccountPage;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        homePage.setUserName("Admin");
        homePage.setPassword("admin123");
        homePage.setSubmitButton();
        Thread.sleep(1000);
        Assert.assertEquals(accountPage.getWelcomeMessage(),"Welcome","User is not logged in");
    }

}
