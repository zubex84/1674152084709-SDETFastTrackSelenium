package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    //TC #1:radio buttons
    //1.GO TO: http://practice.cydeo.com/radio_buttons
    //2. Confirm radio button #Blue is selected by default
    //3. Confirm radio button #Football is NOT selected by default
    //4. Click radio button #Football to select it.
    //5. Verify radio button #Football is selected.
    //6. Click radio button #Red to select it.
    //7. Verify radio button #Red is selected.
    //8. Verify radio button #Blue is not selected.
    //9. Verify radio button #Green is not Enabled.


    public RadioButtonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="blue")
    public WebElement blueButton;

    @FindBy(id="football")
    public WebElement footballButton;

    @FindBy(id="red")
    public WebElement redButton;

    @FindBy(id="green")
    public WebElement greenButton;



}
