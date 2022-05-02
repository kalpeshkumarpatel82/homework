package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Electronics')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By cellPhoneLine = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]");

    // Verify the Page Header for verification
    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setMouserHoverElectronicsLink() {
        mouseHoverToElement(electronicsLink);
    }

    public void setMouseHoverCellPhoneLink() {
        mouseHoverToElement(cellPhoneLine);
    }

    public void setCellPhoneLink() {
        clickOnElement(cellPhoneLine);
    }
}
