package com.ultimateqa.courses.testbase;
/* 
 Created by Kalpesh Patel
 */

import com.ultimateqa.courses.propertyreader.PropertyReader;
import com.ultimateqa.courses.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility{
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
       selectBrowser(browser);
    }

    @AfterClass
    public void tearDown(){
        closeBrowser();
    }

}
