package com.ultimateqa.courses.pages;
/* 
 Created by Kalpesh Patel
 */

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By userName = By.name("user[email]");
    By passWord = By.name("user[password]");
    By signInLink = By.xpath("//div/input[@value='Sign in']");
    By errMsg = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setUserName(String text){
        sendTextToElement(userName,text);
    }
    public void setPassWord(String text){
        sendTextToElement(passWord,text);
    }

    public void setSignInLink(){
        clickOnElement(signInLink);
    }

    public String getErrMessage(){
        return getTextFromElement(errMsg);
    }



}
