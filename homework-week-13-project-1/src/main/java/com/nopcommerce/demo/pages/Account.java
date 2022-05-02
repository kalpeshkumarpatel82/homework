package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Account extends Utility {
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");

    public String getLogOutLinkText(){
        return getTextFromElement(logoutLink);
    }

}
