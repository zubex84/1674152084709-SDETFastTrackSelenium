package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticePage {

    public AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //Launch browser
    //Navigate to url 'https://automationexercise.com/login'
    //Verify 'New User Signup!' is visible
    //Enter name and email address
    //Click 'Signup' button
    //Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //Fill details: Title, Name, Email, Password, Date of birth
    //Select checkbox 'Sign up for our newsletter!'
    //Select checkbox 'Receive special offers from our partners!'
    //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //Click 'Create Account button'
    //Verify that 'ACCOUNT CREATED!' is visible
    //Click 'Continue' button
    //Verify that 'Logged in as username' is visible


    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    public WebElement userSignUp;

    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    public WebElement inputName;

    @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    public WebElement inputEmail;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signUpBtn;

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement header;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioBtn;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayDropdown;

    @FindBy(css = "#months")
    public WebElement monthDropdown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearDropdown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterCheckBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement offerCheckBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement createAccBtn;

    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accCreatedMesagge;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement continueBtn;

    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    public WebElement loggedInMessage;















}
