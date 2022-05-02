package com.nopcommerce.demo.pages;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By ddLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewerlyrLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By gcLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");

    // Click on Login Link
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    // Click on Register Link
    public void clickOnRegisterLink(){
        clickOnElement(registerLink); // fetch from Utility class
    }

    // Click on Top Menu
    public void selectMenu(String menu){
        if(menu.equalsIgnoreCase("Computers")) clickOnElement(computerLink);
        if(menu.equalsIgnoreCase("Electronics")) clickOnElement(electronicsLink);
        if(menu.equalsIgnoreCase("Apparel")) clickOnElement(apparelLink);
        if(menu.equalsIgnoreCase("Digital downloads")) clickOnElement(ddLink);
        if(menu.equalsIgnoreCase("Books")) clickOnElement(booksLink);
        if(menu.equalsIgnoreCase("Jewelry")) clickOnElement(jewerlyrLink);
        if(menu.equalsIgnoreCase("Gift Cards")) clickOnElement(gcLink);
    }
}
