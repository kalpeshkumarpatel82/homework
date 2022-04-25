package utilities;
/* 
 Created by Kalpesh Patel
 */

import browsertesting.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    public void setTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //This method will clear an input text field to an element,
    public void setTextToElement(By by) {
        driver.findElement(by).clear();
    }

    //This method fetches all items from the given elements
    public List<WebElement> listOfWebElementsList(By by) {
        return driver.findElements(by);
    }

    //This method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    // Mouse Hover -- Just Hover No click
    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(by);
        actions.moveToElement(menu).build().perform();
    }

    public String alertText(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        return alert.getText();
    }
    public void alertHandle(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        alert.accept();
    }

    // Verification - using an Assert method -- NOT USED IN THE PROJECT FOR BETTER READABILITY OF CODES
    public void verifyText(By by, String errMsg,String expectedMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(errMsg, expectedMessage, actualMessage);
    }

}
