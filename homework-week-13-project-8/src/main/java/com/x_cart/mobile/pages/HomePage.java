package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingLink = By.xpath("//div[@class='collapse navbar-collapse']//ul/li[3]/a");
    By newLink = By.xpath("//div[@class='collapse navbar-collapse']//ul/li[4]/a");
    By comingSoon = By.xpath("//div[@class='collapse navbar-collapse']//ul/li[5]/a");
    By contactUs = By.xpath("//div[@class='collapse navbar-collapse']//ul/li[6]/a");
    By hotDeals = By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']");
    By saleLink = By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span");
    By bestSellers = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/child::li[2]/child::ul/li[2]/a");

    public void setShippingLink() {
        clickOnElement(shippingLink);
    }

    public void setNewLink(){
        clickOnElement(newLink);
    }

    public void setComingSoon(){
        clickOnElement(comingSoon);
    }

    public void setContactUs(){
        clickOnElement(contactUs);
    }

    public void mouseHoverOnHotDeals(){
        mouseHoverToElement(hotDeals);
    }

    public void mouserHoverOnSale(){
        mouseHoverToElement(saleLink);
    }

    public void setSaleLink(){
        clickOnElement(saleLink);
    }

    public void setBestSellers(){
        clickOnElement(bestSellers);
    }


}
