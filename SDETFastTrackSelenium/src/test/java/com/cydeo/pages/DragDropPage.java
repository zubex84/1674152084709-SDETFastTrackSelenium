package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DragDropPage {

    public DragDropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Go to  "https://www.globalsqa.com/demo-site/draganddrop/"
    //Drag and Drop "High Tatras" and "High Tatras 2" into "Trash"
    //Verify Trash has 2 photo

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]")
    public WebElement iframeWebElement;

    @FindBy(xpath = "(//h5)[1]")
    public WebElement highTetras;

    @FindBy(xpath = "//h5[.='High Tatras 2']")
    public WebElement highTetras2;

    @FindBy(id="trash")
    public WebElement trash;

    @FindBy(xpath = "//div[@id='trash']//li")
    public List<WebElement> trashItems;

    @FindBy(xpath = "")
    public WebElement firstTrash;

}
