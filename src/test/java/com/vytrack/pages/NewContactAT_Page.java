package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewContactAT_Page {
    public NewContactAT_Page(){
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
    @FindBy(xpath = "(//input[contains(@id,'birthday')])[2]")
    public WebElement birthdayTable;
    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;
    @FindBy(xpath = "//div[@id='flash-messages']")
    public WebElement msg_save;


//button[contains(text(),'Save and Close')])[2]

    public void loginAsUser() {
        txt_userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        txt_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }
    public WebElement inputTag(String inputs){
        WebElement input=Driver.getDriver().findElement(By.xpath("(//input[contains(@id,'"+inputs+"')])[1]"));
        return input;
    }
    public void validCredentials(String inputs,String credentials){
       inputTag(inputs).sendKeys(credentials);
        BrowserUtils.sleep(1);
    }
    public void dropdownChoice(String inputs,String choice){
        Select select=new Select(Driver.getDriver().findElement(By.xpath("//select[contains(@id,'"+inputs+"')]")));
        select.selectByVisibleText(choice);
    }
    public void selectDate(int day,int month,int year){


        BrowserUtils.sleep(1);
        Select yearElement=new Select(Driver.getDriver().findElement(By.xpath("//select[contains(@class,'year')]")));
        yearElement.selectByVisibleText(String.valueOf(year));
        BrowserUtils.sleep(1);
        Select monthElement=new Select(Driver.getDriver().findElement(By.xpath("//select[contains(@class,'month')]")));
        monthElement.selectByIndex(month-1);
        BrowserUtils.sleep(1);
        WebElement dayElement=Driver.getDriver().findElement(By.xpath("//a[.='"+day+"']"));
        dayElement.click();


    }



}
