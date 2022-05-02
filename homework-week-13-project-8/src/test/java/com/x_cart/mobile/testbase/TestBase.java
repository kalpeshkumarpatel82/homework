package com.x_cart.mobile.testbase;
/* 
 Created by Kalpesh Patel
 */

import com.x_cart.mobile.propertyreader.PropertyReader;
import com.x_cart.mobile.utility.Utility;
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
        //closeBrowser();
    }

}
