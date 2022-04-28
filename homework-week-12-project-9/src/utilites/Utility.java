package utilites;
/* 
 Created by Kalpesh Patel
 */

import browsertesting.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {
    //This method will click on Element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // this method will get text from elements
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // this method will get text from element for a specific attribute
    public String getTextFromElement(By by, String text) {
        return driver.findElement(by).getAttribute(text);
    }

    // This method will send a text to the elements
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method will send a text to the elements
    public void sendTextToElement(By by) {
        driver.findElement(by).clear();
    }

    // This method will send a specific KEY Stroke to the elements
    public void sendKeyStrokeToElement(By by, Keys keys) {
        driver.findElement(by).sendKeys(keys);
    }


    // This method fetches all items from the given elements
    public List<WebElement> listOfWebElementsList(By by) {
        return driver.findElements(by);
    }

    // this method will select the option by the visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    // Mouse hover -- no click
    public void mouseHover(By by) {
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(by);
        action.moveToElement(menu).build().perform();
    }

    // Alert method -- fetch the text from alert popup
    public String alertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Alert method -- fetch the text from alert popup
    public void alertHandle() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Verification - using an Assert method -- NOT USED IN THE PROJECT FOR BETTER READABILITY OF CODES
    public void verifyText(By by, String errMsg, String expectedMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(errMsg, expectedMessage, actualMessage);
    }

}
