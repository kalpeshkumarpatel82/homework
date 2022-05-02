package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BestSellers extends Utility {
    By pageHeader = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By sortByZToA = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[5]/a");
    By sortByAToZ = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By sortByHighToLow = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[3]/a");
    By sortByRates = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[6]/a");
    By productOrderByName = By.xpath("//ul[@class='products-grid grid-list']/li/div/h5/a");
    By productOrderByPrice = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//span[@class='price product-price']");
    By productOrderByRates = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//div[@class='stars-row full']");
    By appleIphoneLink = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By astroLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[2]/div[4]/div[1]/button[1]");
    By greenStatus = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeGreenStatus = By.xpath("//div/a[@class='close']");
    By viewCartIcon = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By viewCartButton = By.xpath("//span[contains(text(),'View cart')]");


    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void mouseHoverToSortBy() {
        mouseHoverToElement(sortBy);
    }

    public void setProductOrderByDscName() {
        clickOnElement(sortByZToA);
    }
    public void setProductOrderByAscName() {
        clickOnElement(sortByAToZ);
    }

    public void setProductOrderByAscPrice() {
        clickOnElement(sortByHighToLow);
    }

    public void setAppleIphoneLink(){
        clickOnElement(appleIphoneLink);
    }

    public void setAstroLinkLink(){
        clickOnElement(astroLink);
    }

    public void setProductOrderByRates() {
        clickOnElement(sortByRates);
    }

    public String getGreenStatusMessage(){
        return getTextFromElement(greenStatus);
    }

    public void setCloseGreenStatus(){
        clickOnElement(closeGreenStatus);
    }

    public void setViewCartIcon(){
        clickOnElement(viewCartIcon);
    }

    public void setViewCartButton(){
        clickOnElement(viewCartButton);
    }

    // Fetching the list of items
    public List<WebElement> fetchItemsListByName() {
        return listOfWebElementsList(productOrderByName);
    }

    // Fetching the list of items
    public List<WebElement> fetchItemsListByPrice() {
        return listOfWebElementsList(productOrderByPrice);
    }

    // Fetching the list of items
    public List<WebElement> fetchItemsListByRates() {
        return listOfWebElementsList(productOrderByRates);
    }

    public List<String> getAscendingOrderList() {
        List<WebElement> lisTOSort = fetchItemsListByName();
        List<String> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getText();
            myList.add(a);
        }
        return myList;
    }

    public List<Double> getPriceOrderList() {
        List<WebElement> lisTOSort = fetchItemsListByPrice();
        List<Double> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getText().substring(1).replace(".", "");
            Double a1 = Double.valueOf(a);
            myList.add(a1);
        }
        return myList;
    }

    public List<String> getRatesOrderList() {
        List<WebElement> lisTOSort = fetchItemsListByRates();
        List<String> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getDomAttribute("Style");
            myList.add(a);
        }
        return myList;
    }

}
