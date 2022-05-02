package com.ultimateqa.courses.pages;
/* 
 Created by Kalpesh Patel
 */

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signInLink = By.linkText("Sign In");

    public void setSignInLink(){
        clickOnElement(signInLink);
    }

}
