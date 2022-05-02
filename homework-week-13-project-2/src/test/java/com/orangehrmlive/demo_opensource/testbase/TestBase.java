package com.orangehrmlive.demo_opensource.testbase;
/* 
 Created by Kalpesh Patel
 */

import com.orangehrmlive.demo_opensource.propertyreader.PropertyReader;
import com.orangehrmlive.demo_opensource.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
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
