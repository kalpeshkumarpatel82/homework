package com.x_cart.mobile.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.pages.BestSellers;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.Sales;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    Sales sales = new Sales();
    BestSellers bestSellers = new BestSellers();


    @Test // 1
    public void verifySaleProductsArrangeAlphabetically(){
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setSaleLink();

        Assert.assertEquals(sales.getPageHeader(),"Sale","Not on Sale Page!");
        List<String> expectedList= sales.getAscendingOrderList();
        Collections.sort(expectedList);
        //System.out.println(expectedList);
        sales.mouseHoverToSortBy();
        sales.setProductOrderByAscName();
        List<String> actualList= sales.getAscendingOrderList();
        //System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by A to Z");
    }

    @Test // 2
    public void verifySaleProductsPriceArrangeLowToHigh(){
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setSaleLink();

        Assert.assertEquals(sales.getPageHeader(),"Sale","Not on Sale Page!");
        List<Double> expectedList= sales.getPriceOrderList();
        Collections.sort(expectedList);
        System.out.println(expectedList);
        sales.mouseHoverToSortBy();
        sales.setProductOrderByAscPrice();
        List<Double> actualList= sales.getPriceOrderList();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by Low to High Price!");
    }

    @Test // 3
    public void verifySaleProductsArrangeByRates(){
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setSaleLink();

        Assert.assertEquals(sales.getPageHeader(),"Sale","Not on Sale Page!");
        List<String> expectedList= sales.getRatesOrderList();
        Collections.sort(expectedList,Collections.reverseOrder());
        System.out.println(expectedList);
        sales.mouseHoverToSortBy();
        sales.setProductOrderByRates();
        List<String> actualList= sales.getRatesOrderList();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by Rates!");
    }

    @Test // 4
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setBestSellers();

        Assert.assertEquals(bestSellers.getPageHeader(),"Bestsellers","Not on Bestsellers Page!");
        List<String> expectedList= bestSellers.getAscendingOrderList();
        Collections.sort(expectedList,Collections.reverseOrder());
        System.out.println(expectedList);
        bestSellers.mouseHoverToSortBy();
        bestSellers.setProductOrderByDscName();
        Thread.sleep(2000);
        List<String> actualList= bestSellers.getAscendingOrderList();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by Rates!");
    }

    @Test // 5
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setBestSellers();

        Assert.assertEquals(bestSellers.getPageHeader(),"Bestsellers","Not on Bestsellers Page!");
        List<Double> expectedList= bestSellers.getPriceOrderList();
        Collections.sort(expectedList,Collections.reverseOrder());
        System.out.println(expectedList);
        bestSellers.mouseHoverToSortBy();
        bestSellers.setProductOrderByAscPrice();
        Thread.sleep(2000);
        List<Double> actualList= bestSellers.getPriceOrderList();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by Rates!");
    }

    @Test // 6
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        homePage.mouseHoverOnHotDeals();
        homePage.mouserHoverOnSale();
        homePage.setBestSellers();

        Assert.assertEquals(bestSellers.getPageHeader(),"Bestsellers","Not on Bestsellers Page!");
        List<String> expectedList= bestSellers.getRatesOrderList();
        Collections.sort(expectedList,Collections.reverseOrder());
        System.out.println(expectedList);
        bestSellers.mouseHoverToSortBy();
        bestSellers.setProductOrderByRates();
        Thread.sleep(2000);
        List<String> actualList= bestSellers.getRatesOrderList();
        System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by Rates!");
    }
}
