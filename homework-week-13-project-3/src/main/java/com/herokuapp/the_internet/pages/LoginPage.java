package com.herokuapp.the_internet.pages;
/* 
 Created by Kalpesh Patel
 */

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By errMessage = By.xpath("//div[@id='flash']");

    public void setUserName(String text){
        sendTextToElement(userName,text);
    }

    public void setPassword(String text){
        sendTextToElement(password,text);
    }

    public void setLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errMessage);
    }



}
