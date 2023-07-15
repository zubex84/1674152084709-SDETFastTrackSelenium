package com.cydeo.tests;

import com.cydeo.pages.AutomationPracticePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPracticeTest {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    Faker faker = new Faker();


    @Test
    public void automation_practice_test(){



        //Launch browser
        //Navigate to url 'https://automationexercise.com/login'
        Driver.getDriver().get(ConfigurationReader.getProperty("automation.practice.url"));

        //Verify 'New User Signup!' is visible
        Assert.assertTrue(automationPracticePage.userSignUp.isDisplayed());

        //Enter name and email address

        automationPracticePage.inputName.sendKeys(faker.name().firstName());
        automationPracticePage.inputEmail.sendKeys(faker.internet().emailAddress());
        //automationPracticePage.inputName.sendKeys("mamaro");
        //automationPracticePage.inputEmail.sendKeys("mamarokodsaji@email.com");

        //Click 'Signup' button
        automationPracticePage.signUpBtn.click();

        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationPracticePage.header.isDisplayed());

        //Fill details: Title, Name, Email, Password, Date of birth
        automationPracticePage.mrRadioBtn.click();
        automationPracticePage.password.sendKeys(faker.internet().password());

        Select selectDay = new Select(automationPracticePage.dayDropdown);
        selectDay.selectByValue("6");

        Select selectMonth = new Select(automationPracticePage.monthDropdown);
        selectMonth.selectByIndex(5);

        Select selectYear = new Select(automationPracticePage.yearDropdown);
        selectYear.selectByVisibleText("2017");


        BrowserUtils.sleep(1);


        //Select checkbox 'Sign up for our newsletter!'
        automationPracticePage.newsletterCheckBox.click();


        //Select checkbox 'Receive special offers from our partners!'
        automationPracticePage.offerCheckBox.click();

        BrowserUtils.sleep(1);
        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        automationPracticePage.firstName.sendKeys(faker.name().firstName());
        automationPracticePage.lastName.sendKeys(faker.name().lastName());
        BrowserUtils.sleep(1);
        automationPracticePage.company.sendKeys(faker.company().name());
        automationPracticePage.address.sendKeys(faker.address().streetAddress());
        BrowserUtils.sleep(1);
        Select select = new Select(automationPracticePage.countryDropDown);
        select.selectByVisibleText("Canada");

        automationPracticePage.state.sendKeys(faker.address().state());
        automationPracticePage.city.sendKeys(faker.address().city());
        BrowserUtils.sleep(1);
        automationPracticePage.zipCode.sendKeys(faker.address().zipCode());
        automationPracticePage.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());

        BrowserUtils.sleep(2);


        //Click 'Create Account button'
        automationPracticePage.createAccBtn.click();


        //Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertEquals(automationPracticePage.accCreatedMesagge.getText(), "ACCOUNT CREATED!");

        //Click 'Continue' button
        automationPracticePage.continueBtn.click();

        //Verify that 'Logged in as username' is visible



    }


}
