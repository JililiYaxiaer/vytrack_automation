package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSC_Page {

    public LoginSC_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='_username']" )
    public WebElement inp_username;

    @FindBy(xpath = "//input[@name='_password']" )
    public WebElement inp_password;

    @FindBy(xpath = "//button[@name='_submit']" )
    public WebElement btn_login;


    public void login_salesManager(){
        inp_username.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
        inp_password.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
        btn_login.click();
    }

    public void login_driver(){
        inp_username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        inp_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }

    public void login_storeManager(){
        inp_username.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
        inp_password.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
        btn_login.click();
    }





}
