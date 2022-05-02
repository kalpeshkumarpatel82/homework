package com.parasoft.parabank.testbase;
/* 
 Created by Kalpesh Patel
 */

import com.parasoft.parabank.propertyreader.PropertyReader;
import com.parasoft.parabank.utility.Utility;
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
