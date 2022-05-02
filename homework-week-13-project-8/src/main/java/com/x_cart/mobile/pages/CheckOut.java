package com.x_cart.mobile.pages;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class CheckOut extends Utility {
    By pageHeader = By.xpath("//h1[@class='title']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By address = By.xpath("//input[@id='shippingaddress-street']");
    By city = By.xpath("//input[@id='shippingaddress-city']");
    By country = By.xpath("//select[@id='shippingaddress-country-code']");
    By state = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By email = By.xpath("//input[@id='email']");
    By createProfile = By.xpath("//input[@id='create_profile']");
    By password = By.xpath("//input[@id='password']");
    By deliveryMethod = By.xpath("//input[@id='method128']");
    By paymentMethod = By.xpath("//input[@id='pmethod6']");
    By totalCurrencySymbol = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']");
    By totalIntegerPart = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-integer']");
    By totalDelimiter = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']");
    By totalDecimal = By.xpath("//div[@class='total clearfix']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']");
    By placeOrderButton = By.xpath("//span[contains(text(),'Place order:')]");


    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setFirstName(String text){
        sendTextToElement(firstName, text);
    }

    public void setLastName(String text){
        sendTextToElement(lastName,text);
    }

    public void setAddress(String text){
        sendTextToElement(address,text);
    }

    public void clearCity(){
        sendTextToElement(city);
    }
    public void setCity(String text){
        sendTextToElement(city,text);
    }

    public void setCountry(String text){
        selectByVisibleTextFromDropDown(country,text);
    }

    public void setState(String text){
        sendTextToElement(state,text);
    }

    public void setZipCode(String text){
        sendTextToElement(zipCode,text);
    }

    public void clearEmailFiled(){
        sendTextToElement(email);
    }

    public void setEmail(String text){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = text + timestamp.getTime()/10000 + "@domain.com";
        sendTextToElement(email,emailAddress);
    }

    public void setCreateProfile(){
        clickOnElement(createProfile);
    }

    public void setPassword(String text){
        sendTextToElement(password,text);
    }

    public void setDeliveryMethod(){
        clickOnElement(deliveryMethod);
    }

    public void setPaymentMethod(){
        clickOnElement(paymentMethod);
    }

    public String getTotalPrice(){
        return getTextFromElement(totalCurrencySymbol)+getTextFromElement(totalIntegerPart)+getTextFromElement(totalDelimiter)+getTextFromElement(totalDecimal);
    }

    public void setPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }

}
