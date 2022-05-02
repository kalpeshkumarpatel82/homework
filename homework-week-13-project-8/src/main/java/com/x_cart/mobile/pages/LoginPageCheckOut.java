package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LoginPageCheckOut extends Utility {
    By pageHeader = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");


    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setEmailField(String text){
        sendTextToElement(emailField,text);
    }

    public void setContinueButton(){
        clickOnElement(continueButton);
    }
}
