package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vytrack_login_page {

    public Vytrack_login_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "_username")
    public WebElement input_username;

    @FindBy(name = "_password")
    public WebElement input_password;

    @FindBy(name = "_submit")
    public WebElement btn_login;

    public void login_salesManager(){
        input_username.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
        input_password.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
        btn_login.click();
    }

    public void login_driver(){
        input_username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        input_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }

    public void login_storeManager(){
       input_username.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
       input_password.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
       btn_login.click();
    }


}
