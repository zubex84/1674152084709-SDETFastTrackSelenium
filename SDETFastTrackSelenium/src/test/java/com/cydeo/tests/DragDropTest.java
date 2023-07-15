package com.cydeo.tests;

import com.cydeo.pages.DragDropPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropTest {

    Actions actions = new Actions(Driver.getDriver());
    DragDropPage dragDropPage = new DragDropPage();

    @Test
    public void  dragDropTest(){

        //Go to  "https://www.globalsqa.com/demo-site/draganddrop/"
        Driver.getDriver().get(ConfigurationReader.getProperty("dragdrop.url"));
        Driver.getDriver().switchTo().frame(dragDropPage.iframeWebElement);

        //Drag and Drop "High Tatras" and "High Tatras 2" into "Trash"
        actions.dragAndDrop(dragDropPage.highTetras, dragDropPage.trash).perform();
        actions.dragAndDrop(dragDropPage.highTetras2, dragDropPage.trash).perform();
        BrowserUtils.sleep(3);
        /*actions.moveToElement(dragDropPage.highTetras2).clickAndHold()
                .moveToElement(dragDropPage.trash)
                .pause(3000)
                .release().perform();
        BrowserUtils.sleep(3);

         */

        //Verify Trash has 2 photo
        Assert.assertTrue(dragDropPage.trashItems.size()==2);



    }



}
