package com.parasoft.parabank.pages;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@class='button' and @value='Log In']");
    By errMsg = By.xpath("//p[text()='The username and password could not be verified.']");
    By pageHeader = By.xpath("//h2[text()='Customer Login']");



    public void setRegisterLink(){
       clickOnElement(registerLink);
    }
    public void setUserName(String text) {
        sendTextToElement(userName, text);
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
    }

    public void setLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errMsg);
    }

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }
}
