package utilities;
/* 
 Created by Kalpesh Patel
 */

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    //This method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    //This method will get text from element for a specific attribute
    public String getTextFromElement(By by, String att) {
        return driver.findElement(by).getAttribute(att);
    }

    //This method will send text to an element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //This method will clear a input text field to an element,
    public void sendTextToElement(By by) {
        driver.findElement(by).clear();
    }

    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

}
