package hotdeals;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test //1
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); //		1.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); //	1.2 Mouse hover on the “Sale”  link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); // 1.2 and click

        //1.3 Verify the text “Sale”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Sale";
        Assert.assertEquals("Not on Sale Page!", expectedMessage, actualMessage);
        Thread.sleep(500);

        //		1.4 Mouse hover on “Sort By” and select “Name A-Z”
        //mouseHover(By.xpath("//span[contains(text(),'Recommended')]"));
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        Thread.sleep(500); // Allow page to load

        //		1.5 Verify that the product arrange alphabetically
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        String expectedMessage1 = "Name A - Z";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);

    }

    @Test //2
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); //		2.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); //		2.2 Mouse hover on the “Sale”  link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); //and click

        //	2.3 Verify the text “Sale”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Sale";
        Assert.assertEquals("Not on Sale Page!", expectedMessage, actualMessage);

        Thread.sleep(500); // Allow page to load
        // 	2.4 Mouse hover on “Sort By” and select “Price Low-High”
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='p.price' and @data-sort-order='asc']"));

        Thread.sleep(500); // Allow page to load
        // 	2.5 Verify that the product’s price arrange Low to High
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Price Low - High')]"));
        String expectedMessage1 = "Price Low - High";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);

    }

    @Test //3
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); //		3.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); //		3.2 Mouse hover on the “Sale”  link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span")); // 3.2 and click

        //		3.3 Verify the text “Sale”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Sale";
        Assert.assertEquals("Not on Sale Page!", expectedMessage, actualMessage);

        Thread.sleep(500); // Allow page to load
        //		3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='r.rating' and @data-sort-order='asc']"));
        Thread.sleep(500);// Allow page to load
        //		3.5 Verify that the product’s arrange Rates
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        String expectedMessage1 = "Rates";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);
    }

    @Test //4
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); // 		1.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); // 		1.2 Mouse hover on the “Bestsellers”  link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); //  and click

        //		1.3 Verify the text “Bestsellers”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Bestsellers";
        Assert.assertEquals("Not on Bestsellers Page!", expectedMessage, actualMessage);

        Thread.sleep(500); // Allow page to load
        //		1.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='desc']"));
        Thread.sleep(500); // Allow page to load
        // 		1.5 Verify that the product arrange by Z to A
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Name Z - A')]"));
        String expectedMessage1 = "Name Z - A";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);
    }

    @Test //5
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); //		2.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); // 		2.2 Mouse hover on the “Bestsellers” link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); //2.2 and click

        //		2.3 Verify the text “Bestsellers”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Bestsellers";
        Assert.assertEquals("Not on Bestsellers Page!", expectedMessage, actualMessage);

        Thread.sleep(500); // Allow page to load
        // 		2.4 Mouse hover on “Sort By” and select “Price High-Low”
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='p.price' and @data-sort-order='desc']"));
        Thread.sleep(500); // Allow page to load
        // 		2.5 Verify that the product’s price arrange High to Low
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Price High - Low')]"));
        String expectedMessage1 = "Price High - Low";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);
    }

    @Test //6
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']")); //		3.1 Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); // 		3.2 Mouse hover on the “Bestsellers”  link
        clickOnElement(By.xpath("//div/ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf has-sub']//ul/li/a/span[text()='Bestsellers']")); // 3.2 and click

        // 		3.3 Verify the text “Bestsellers”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedMessage = "Bestsellers";
        Assert.assertEquals("Not on Bestsellers Page!", expectedMessage, actualMessage);

        Thread.sleep(500); //Allow page to load

        //		3.4 Mouse hover on “Sort By” and select “Rates”
        //mouseHover(By.xpath("//span[contains(text(),'Sales')]"));
        mouseHover(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        clickOnElement(By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='r.rating' and @data-sort-order='asc']"));
        Thread.sleep(500); //Allow page to load
        // 		3.5 Verify that the product’s arrange Rates
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        String expectedMessage1 = "Rates";
        Assert.assertEquals("Sorting Failed", expectedMessage1, actualMessage1);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
