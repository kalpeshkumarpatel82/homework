package com.orangehrmlive.demo_opensource.pages;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By welcomeMessage = By.xpath("//a[@id='welcome']");

    public String getWelcomeMessage(){
        return getTextFromElement(welcomeMessage).substring(0,7);
    }
}
