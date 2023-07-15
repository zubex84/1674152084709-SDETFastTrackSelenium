package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframeWindowhandlePage {

    public IframeWindowhandlePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Test website: https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
    //Test Scenario:
    //Step 1- Go to the above URL.
    //Step 2- Get the current window’s handle and write to the console window. It must be the first window handle.
    //Step 3- Locate the “Visit W3Schools.com!” link and click it.
    //Step 4- Get all window handles and hold them in a list.
    //Step 5- Write to total window handle number to the console. It must be 2.
    //Step 6- Switch to the second window.
    //Step 7- Get the current window’s handle and write to the console window. It must be a second window handle.
    //Step 8- Check the upper left side logo in the second window.
    //Step 9- Go back (Switch) to the first window.
    //Step 10- Get the current window’s handle and write to the console window. It must be the first window handle.
    //Step 11- Check the See Run Button Text. It must contain “Run >” text.


    @FindBy(linkText = "Visit W3Schools.com!")
    public WebElement w3SchoolLink;

    @FindBy(xpath = "//iframe[@id='iframeResult']")
    public WebElement iframe;

    @FindBy(xpath = "//body/div[@id='pagetop']/a[1]/i[1]")
    public WebElement logo;

   @FindBy(xpath = "//button[@id='runbtn']")
   public WebElement runBttn;

}
