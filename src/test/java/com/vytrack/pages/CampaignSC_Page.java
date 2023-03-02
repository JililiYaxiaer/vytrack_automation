package com.vytrack.pages;

import com.vytrack.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CampaignSC_Page {
    public CampaignSC_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[5]")
    public WebElement btn_marketing;

    @FindBy(xpath = "(//a[@href='/campaign/'])[3]")
    public WebElement btn_campaign;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement btn_createCampaign;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement btn_owner;


    @FindBy(xpath = "//input[contains(@class,'select2-input')]")
    public WebElement inp_owner;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_name')]")
    public WebElement inp_name;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_code')]")
    public WebElement inp_code;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement inp_startDate;

    public WebElement selectDate(int num){
        String date = "//table//tbody//tr//td[.='" + num + "']";

        return Driver.getDriver().findElement(By.xpath(date));

    }

    

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement inp_endDate;

    @FindBy(xpath = "//body[@class='mce-content-body ']")
    public WebElement inp_description;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_budget')]")
    public WebElement inp_budget;

    @FindBy(xpath = "//select[contains(@id,'oro_campaign_form_reportPeriod')]")
    public WebElement select_report;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement btn_save;

    @FindBy(xpath = "//div[@id='flash-messages']")
    public WebElement msg_save;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[1]")
    public WebElement msg_err_name;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[4]")
    public WebElement msg_err_code;




















































}
