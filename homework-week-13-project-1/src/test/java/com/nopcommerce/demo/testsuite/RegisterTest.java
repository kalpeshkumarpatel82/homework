package com.nopcommerce.demo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.Registration;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registration.getRegisterPageHeader(),"Register","Not navigated to correct Page!");
        registration.setGenderButton();
        registration.setFirstName("Laluprasad");
        registration.setLastName("Yadav");
        registration.setDateOfBirthDay("22");
        registration.setMonthOfBirthDay("May");
        registration.setYearOfBirthDay("1968");
        registration.setEmailAddress("laluprasad");
        registration.setPassword("Password789");
        registration.setRepeatPassword("Password789");
        registration.setRegisterButton();
        Assert.assertEquals(registration.getRegistrationConfrimMessage(),"Your registration completed","User is not logged in");

    }

}
