package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Sales extends Utility {
    By pageHeader = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By sortByAToZ = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By sortByLowToHigh = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='p.price' and @data-sort-order='asc']");
    By sortByRates = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[6]/a");
    By productOrderByName = By.xpath("//ul[@class='products-grid grid-list']/li/div/h5/a");
    By productOrderByPrice = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//span[@class='price product-price']");
    By productOrderByRates = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//div[@class='stars-row full']");

    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void mouseHoverToSortBy() {
        mouseHoverToElement(sortBy);
    }

    public void setProductOrderByAscName() {
        clickOnElement(sortByAToZ);
    }

    public void setProductOrderByAscPrice() {
        clickOnElement(sortByLowToHigh);
    }

    public void setProductOrderByRates() {
        clickOnElement(sortByRates);
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
