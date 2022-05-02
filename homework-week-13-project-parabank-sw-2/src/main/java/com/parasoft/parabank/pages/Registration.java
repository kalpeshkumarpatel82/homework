package com.parasoft.parabank.pages;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Registration extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstName = By.xpath("//input[@id='customer.firstName']");
    By lastName = By.xpath("//input[@id='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNUmber = By.xpath("//input[@id='customer.phoneNumber']");
    By ssn = By.xpath("//input[@id='customer.ssn']");
    By userName = By.xpath("//input[@id='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By repeatPassword = By.xpath("//input[@id='repeatedPassword']");
    By registerButton = By.xpath("//input[@class='button' and @value='Register']");
    By confirmMessage = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");


    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void setLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void setAddress(String text) {
        sendTextToElement(address, text);
    }

    public void setCity(String text) {
        sendTextToElement(city, text);
    }

    public void setState(String text) {
        sendTextToElement(state, text);
    }

    public void setZipCode(String text) {
        sendTextToElement(zipCode, text);
    }

    public void setPhoneNUmber(String text) {
        sendTextToElement(phoneNUmber, text);
    }

    public void setSsn(String text) {
        sendTextToElement(ssn, text);
    }

    public void setUserName(String text) {
        sendTextToElement(userName, text);
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
    }

    public void setRepeatPassword(String text) {
        sendTextToElement(repeatPassword, text);
    }

    public void setRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getConfirmMessage(){
        return getTextFromElement(confirmMessage);
    }

}
