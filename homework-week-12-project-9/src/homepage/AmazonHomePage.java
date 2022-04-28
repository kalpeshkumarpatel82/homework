package homepage;
/* 
 Created by Kalpesh Patel
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilites.Utility;

import java.util.List;

public class AmazonHomePage extends Utility {
    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void fetchProductFromHomePage() throws InterruptedException {
        Thread.sleep(2000);
        // Sending a search query to the search bar
        clickOnElement(By.xpath("//input[@id='sp-cc-accept']"));

        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"),"Dell Laptop");
        sendKeyStrokeToElement(By.xpath("//input[@id='twotabsearchtextbox']"), Keys.ENTER);
        Thread.sleep(2000);
        //clickOnElement(By.xpath("//div[@id='brandsRefinements']//li[@id='p_89/Dell']//input[@type='checkbox']"));
        clickOnElement(By.xpath("//div[@id='brandsRefinements']//li[@id='p_89/Dell']//i[@class='a-icon a-icon-checkbox']"));
        Thread.sleep(2000);
        List<WebElement> searchList = listOfWebElementsList(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a/span[contains(text(),'Dell')]"));
        System.out.println("--------------------------------------------------");
        System.out.println("Number of Searched items is : " +searchList.size());
        System.out.println("--------------------------------------------------");
        System.out.println("              Names are following ");
        System.out.println("--------------------------------------------------");


        for(WebElement data : searchList){
            String a = data.getText();
            System.out.println(a);

        }

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
