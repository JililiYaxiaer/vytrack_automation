package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.sql.rowset.BaseRowSet;

public class VytrackPage {
    public VytrackPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement txt_userName;

    @FindBy(css = "#prependedInput2")
    public WebElement txt_password;

    @FindBy(id = "_submit")
    public WebElement btn_login;

    @FindBy(xpath = "//a[.='Create Contact']")
    public WebElement createContactLink;


    public void loginAsUser() {
        txt_userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        txt_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }
    public void validCredentials(String credentials,String inputs){
       WebElement validInput=Driver.getDriver().findElement(By.xpath("(//input[contains(@id,'"+credentials+"')])[1]"));
       validInput.sendKeys(inputs);
        BrowserUtils.sleep(1);
    }



}
