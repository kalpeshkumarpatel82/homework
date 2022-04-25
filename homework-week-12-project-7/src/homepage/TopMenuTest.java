package homepage;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMenu(String menu) {
        //System.out.println("//ul[@class='top-menu notmobile']//a[contains(text(),'"+menu+"')]"); // -- for debug purpose
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'" + menu + "')]"));
        //clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')]"));
    }

    @Test
    public void verifyPageNavigation() {
        List<String> topMenus = new ArrayList<>();
        topMenus.add("Computers");
        topMenus.add("electronics");
        topMenus.add("Digital downloads");
        topMenus.add("Books");
        topMenus.add("Jewelry");
        topMenus.add("Gift Cards");


        for (int i = 0; i < topMenus.size(); i++) {
            selectMenu(topMenus.get(i));
            String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'" + topMenus.get(i) + "')]"));
            Assert.assertEquals("Not on correct Page!!", topMenus.get(i), actualMessage);
            System.out.println("User is on Correct Page : "+topMenus.get(i));
        }
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
