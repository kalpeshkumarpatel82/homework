package com.saucedemo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginButton = By.id("login-button");

    public void setUserName(String text){
        sendTextToElement(userName,text);
    }

    public void setPassWord(String text){
        sendTextToElement(passWord,text);
    }

    public void setLoginButton(){
        clickOnElement(loginButton);
    }


}
