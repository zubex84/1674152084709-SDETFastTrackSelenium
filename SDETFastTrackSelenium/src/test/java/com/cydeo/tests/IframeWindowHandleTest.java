package com.cydeo.tests;

import com.cydeo.pages.IframeWindowhandlePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class IframeWindowHandleTest {

    @Test
    public void iframe_window_test(){

        IframeWindowhandlePage iframeWindowhandlePage = new IframeWindowhandlePage();




            //Test website: https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
            //Test Scenario:
            //Step 1- Go to the above URL.
            Driver.getDriver().get(ConfigurationReader.getProperty("w3school.url"));

            //Step 2- Get the current window’s handle and write to the console window. It must be the first window handle.
            String mainWindowhandle = Driver.getDriver().getWindowHandle();
            System.out.println("mainWindowhandle = " + mainWindowhandle);

            Driver.getDriver().switchTo().frame(iframeWindowhandlePage.iframe);

            //Step 3- Locate the “Visit W3Schools.com!” link and click it.
            iframeWindowhandlePage.w3SchoolLink.click();

            //Step 4- Get all window handles and hold them in a set.
            Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
            System.out.println("allWindowHandles = " + allWindowHandles);

            //Step 5- Write to total window handle number to the console. It must be 2.
            System.out.println("allWindowHandles.size() = " + allWindowHandles.size());

            //Step 6- Switch to the second window.
            for (String eachWindow : allWindowHandles) {
                Driver.getDriver().switchTo().window(eachWindow);
                System.out.println("eachWindow = " + eachWindow);

        }


            //Step 7- Get the current window’s handle and write to the console window. It must be a second window handle.
            String newWindowhandle = Driver.getDriver().getWindowHandle();
            System.out.println("newWindowhandle = " + newWindowhandle);
        Assert.assertNotEquals(newWindowhandle, mainWindowhandle);

            //Step 8- Check the upper left side logo in the second window.
        iframeWindowhandlePage.logo.isDisplayed();

            //Step 9- Go back (Switch) to the first window.
        Driver.getDriver().switchTo().window(mainWindowhandle);

            //Step 10- Get the current window’s handle and write to the console window. It must be the first window handle.
        Assert.assertEquals(mainWindowhandle, Driver.getDriver().getWindowHandle());


            //Step 11- Check the See Run Button Text. It must contain “Run >” text.
        String textFromBttn = iframeWindowhandlePage.runBttn.getText();
        System.out.println("textFromBttn = " + textFromBttn);
        Assert.assertTrue(textFromBttn.contains("Run ❯"));


    }


}
