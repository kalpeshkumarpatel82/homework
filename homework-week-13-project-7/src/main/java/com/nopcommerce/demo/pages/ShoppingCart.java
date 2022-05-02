package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By pageHeader = By.xpath("//div/h1[text()='Shopping cart']");
    By quantityField = By.xpath("//td[@class='quantity']//input");
    By updateCartButton = By.id("updatecart");
    By totalCheckOutPrice = By.xpath("//span[@class='product-subtotal']");
    By termAndConditionsCheckBox = By.xpath("//input[@id='termsofservice']");
    By checkOutButton = By.xpath("//button[@id='checkout']");



    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void clearQuantity(){
        sendTextToElement(quantityField);
    }

    public void changeQuantity(String qty){
        sendTextToElement(quantityField,qty);
    }

    public void setUpdateCartButton(){
        clickOnElement(updateCartButton);
    }

    public String getTotalCheckoutPrice(){
        return getTextFromElement(totalCheckOutPrice);
    }

    public void setTermAndConditionsCheckBox(){
        clickOnElement(termAndConditionsCheckBox);
    }

    public void setCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public String getQuantityFromShoppingCart(String text){
        return getTextFromElement(quantityField,text);
    }



}
