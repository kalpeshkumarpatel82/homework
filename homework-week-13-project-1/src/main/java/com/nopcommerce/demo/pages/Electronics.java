package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Electronics')]");

    // Verify the Page Header for verification
    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }


}
