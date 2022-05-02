package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Registration extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Register')]");
    By genderButton = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirthDay = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirthDay = By.xpath("//select[@name='DateOfBirthYear']");
    By emailAddress = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By repeatPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By confirmMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String getRegisterPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setGenderButton(){
        clickOnElement(genderButton);
    }

    public void setFirstName(String text){
        sendTextToElement(firstName,text);
    }

    public void setLastName(String text){
        sendTextToElement(lastName,text);
    }

    public void setDateOfBirthDay(String text){
        selectByVisibleTextFromDropDown(dateOfBirthDay,text);
    }

    public void setMonthOfBirthDay(String text){
        selectByVisibleTextFromDropDown(monthOfBirthDay, text);
    }

    public void setYearOfBirthDay(String text){
        selectByVisibleTextFromDropDown(yearOfBirthDay,text);
    }

    public void setEmailAddress(String text){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String email = text + timestamp.getTime()/10000 + "@domain.com";
        sendTextToElement(emailAddress,email);
    }

    public void setPassword(String text){
        sendTextToElement(password,text);
    }

    public void setRepeatPassword(String text){
        sendTextToElement(repeatPassword,text);
    }

    public void setRegisterButton(){
        clickOnElement(registerButton);
    }

    public String getRegistrationConfrimMessage(){
        return getTextFromElement(confirmMessage);
    }

}
