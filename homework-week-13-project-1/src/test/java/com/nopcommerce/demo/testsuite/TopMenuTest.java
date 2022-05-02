package com.nopcommerce.demo.testsuite;
/* 
 Created by Kalpesh Patel
 */

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
    Apparel apparel = new Apparel();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on Computer TopMenu
        homePage.selectMenu("Computers");
        Assert.assertEquals(computers.getPageHeader(), "Computers", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Computers");

        //Click on Electronics TopMenu
        homePage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Electronics");

        //Click on Apparel TopMenu
        homePage.selectMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(), "Apparel", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Apparel");

        //Click on Digital downloads TopMenu
        homePage.selectMenu("Digital downloads");
        Assert.assertEquals(digitalDownloads.getPageHeader(), "Digital downloads", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Digital downloads");

        //Click on Books TopMenu
        homePage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Books");

        //Click on Jewelry  TopMenu
        homePage.selectMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageHeader(), "Jewelry", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Jewelry");

        //Click on Gift Cards  TopMenu
        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not on Correct Page!");
        System.out.println("User is on Correct Page : Gift Cards");

    }
}
