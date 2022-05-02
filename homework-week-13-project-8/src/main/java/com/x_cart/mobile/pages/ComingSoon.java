package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoon extends Utility {
    By pageHeader = By.xpath("//h1[@id='page-title']");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }
}
