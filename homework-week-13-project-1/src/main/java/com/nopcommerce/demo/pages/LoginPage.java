package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userName = By.xpath("//input[@id='Email']");
    By passWord = By.xpath("//input[@id='Password']");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setUserName(String text) {
        sendTextToElement(userName, text);
    }

    public void setPassWord(String text) {
        sendTextToElement(passWord, text);
    }

    public void setLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
