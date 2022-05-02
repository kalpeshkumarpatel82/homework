package com.orangehrmlive.demo_opensource.pages;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

}
