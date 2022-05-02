package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopLink = By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]");


    // Verify the Page Header for verification
    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    // Click on Desktop link
    public void clickOnDesktop(){
        clickOnElement(desktopLink);
    }



}
