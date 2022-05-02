package com.saucedemo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class Products extends Utility {
    By items = By.xpath("//div[@class='inventory_item']");
    By pageHeader = By.xpath("//span[contains(text(),'Products')]");

    public int getItemsDisplayed(){
        return listOfWebElementsList(items).size();
    }
    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }
}
