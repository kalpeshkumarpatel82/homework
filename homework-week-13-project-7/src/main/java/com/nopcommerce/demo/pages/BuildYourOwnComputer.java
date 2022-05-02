package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By select400GBHDD = By.id("product_attribute_3_7");
    By selectVistaPremium = By.id("product_attribute_4_9");
    By selectTotalCommander = By.id("product_attribute_5_12");
    By getProductPrice = By.xpath("//span[@id='price-value-1']");
    By clickOnAddToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By infoFromGreenBar = By.xpath("//div/p[@class='content']");
    By closeGreenBar = By.xpath("//span[@class='close']");
    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");



    // Verify the Page Header for verification
    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setSelectProcessor(String text){
        selectByVisibleTextFromDropDown(selectProcessor,text);
    }

    public void setSelectRam(String text){
        selectByVisibleTextFromDropDown(selectRam,text);
    }

    public void setSelect400GBHDD(){
        clickOnElement(select400GBHDD);
    }

    public void setSelectVistaPremium(){
        clickOnElement(selectVistaPremium);
    }

    public void setTotalCommander(){
        clickOnElement(selectTotalCommander);
    }

    public String getProductPrice(){
        return getTextFromElement(getProductPrice);
    }

    public void setClickOnAddToCartButton(){
        clickOnElement(clickOnAddToCartButton);
    }

    public String getInfoFromGreenBar(){
        return getTextFromElement(infoFromGreenBar);
    }

    public void setCloseGreenBar(){
        clickOnElement(closeGreenBar);
    }

    public void mouseHoverToShoppingCartLink(){
        mouseHoverToElement(shoppingCartLink);
    }

    public void clickOnGoToCartButton(){
        clickOnElement(goToCartButton);
    }

}
