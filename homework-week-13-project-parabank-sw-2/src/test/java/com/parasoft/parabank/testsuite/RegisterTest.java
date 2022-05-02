package com.parasoft.parabank.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.Registration;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.setRegisterLink();
        Assert.assertEquals(registration.getPageHeader(), "Signing up is easy!", "User is not on Correct Page!");

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.setRegisterLink();
        registration.setFirstName("Babubhai");
        registration.setLastName("Chhota");
        registration.setAddress("120 Mandir road");
        registration.setCity("Baroda");
        registration.setState("GUJ");
        registration.setZipCode("380016");
        registration.setPhoneNUmber("079 1459863");
        registration.setSsn("789741321");
        registration.setUserName("babuchhota");
        registration.setPassword("passWord789");
        registration.setRepeatPassword("passWord789");
        registration.setRegisterButton();
        Assert.assertEquals(registration.getConfirmMessage(),"Your account was created successfully. You are now logged in.","Failed to register");
    }


}
