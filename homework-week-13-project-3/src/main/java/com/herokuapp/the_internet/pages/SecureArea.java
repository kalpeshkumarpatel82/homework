package com.herokuapp.the_internet.pages;
/* 
 Created by Kalpesh Patel
 */

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class SecureArea extends Utility {
    By pageHeader = By.xpath("//div[@class='example' and contains(.,' Secure Area')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

}
