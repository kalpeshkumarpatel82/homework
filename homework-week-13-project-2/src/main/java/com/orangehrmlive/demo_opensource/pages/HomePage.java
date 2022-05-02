package com.orangehrmlive.demo_opensource.pages;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.name("txtUsername");
    By password = By.name("txtPassword");
    By submitButton = By.name("Submit");
    By forgotPassword = By.linkText("Forgot your password?");


    public void setUserName(String text) {
        sendTextToElement(userName, text);
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
    }

    public void setSubmitButton() {
        clickOnElement(submitButton);
    }

    public void setForgotPassword(){
        clickOnElement(forgotPassword);
    }
}
