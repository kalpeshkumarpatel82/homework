package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By pageHeader = By.xpath("//h1[@id='page-title']");
    By subTotalCurrencySymbol = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[1]");
    By subTotalIntegerPart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[2]");
    By subTotalDelimiter = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[3]");
    By subTotalDecimal = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[4]");
    By totalCurrencySymbol = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']");
    By totalIntegerPart = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-integer']");
    By totalDelimiter = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']");
    By totalDecimal =By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']");
    By checkOutButton = By.xpath("//span[contains(text(),'Go to checkout')]");
    By emptyCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By deleteMessage = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");




    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public String getSubTotalPrice(){
        return getTextFromElement(subTotalCurrencySymbol)+getTextFromElement(subTotalIntegerPart)+getTextFromElement(subTotalDelimiter)+getTextFromElement(subTotalDecimal);
    }
    public String getTotalPrice(){
        return getTextFromElement(totalCurrencySymbol)+getTextFromElement(totalIntegerPart)+getTextFromElement(totalDelimiter)+getTextFromElement(totalDecimal);
    }

    public void setCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public void setEmptyCart(){
        clickOnElement(emptyCart);
    }

    public String fetchMessageFromAlert(){
        return getTextFromAlert();
    }

    public void acceptAlertOk(){
        acceptAlert();
    }

    public String getConfirmDeleteMessage(){
        return getTextFromElement(deleteMessage);
    }
}
