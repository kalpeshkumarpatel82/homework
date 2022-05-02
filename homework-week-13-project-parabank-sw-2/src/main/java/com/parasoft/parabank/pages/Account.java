package com.parasoft.parabank.pages;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class Account extends Utility {
    By pageHeader = By.xpath("//h1[@class='title' and contains(text(),'Accounts Overview')]");
    By logOutButton = By.xpath("//a[text()='Log Out']");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setLogOutButton(){
        clickOnElement(logOutButton);
    }
}
